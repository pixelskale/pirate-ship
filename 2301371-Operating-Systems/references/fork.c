// Generative AI was used in creating most of this document

// compile: gcc fork.c -o fork
// run: ./fork              -> Version 1 (unordered, default)
// run: ./fork -v2          -> Version 2 (sequential ordered)
// run: ./fork -v3          -> Version 3 (parallel ordered with pipes)
// run: ./fork -a           -> Run all versions
// run: ./fork -b           -> Safe fork bomb demo (2^3 = 8 processes)
// run: ./fork --help       -> Show usage

#include <sys/wait.h>
#include <sys/types.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <string.h>

#define NUM_CHILDREN 10

// -------------------- VERSION 1 --------------------
void version1() {
    printf("==> VERSION 1: UNORDERED\n");
    pid_t pid;
    for (int i = 0; i < NUM_CHILDREN; i++) {
        pid = fork();
        if (pid < 0) {
            perror("fork");
            exit(1);
        } else if (pid == 0) {
            printf("I'm the child number %d (pid %d)\n", i, getpid());
            exit(0);
        }
    }
    for (int i = 0; i < NUM_CHILDREN; i++) {
        wait(NULL);
    }
    printf("Parent terminates (pid %d)\n", getpid());
}

// -------------------- VERSION 2 --------------------
void version2() {
    printf("==> VERSION 2: SEQUENTIAL ORDERED\n");
    pid_t pid;
    for (int i = 0; i < NUM_CHILDREN; i++) {
        pid = fork();
        if (pid < 0) {
            perror("fork");
            exit(1);
        } else if (pid == 0) {
            printf("I'm the child number %d (pid %d)\n", i, getpid());
            exit(0);
        } else {
            wait(NULL);
        }
    }
    printf("Parent terminates (pid %d)\n", getpid());
}

// -------------------- VERSION 3 --------------------
void version3() {
    printf("==> VERSION 3: PARALLEL ORDERED WITH PIPES\n");
    int pipes[NUM_CHILDREN][2];
    pid_t pid;

    for (int i = 0; i < NUM_CHILDREN; i++) {
        if (pipe(pipes[i]) < 0) {
            perror("pipe");
            exit(1);
        }
    }

    for (int i = 0; i < NUM_CHILDREN; i++) {
        pid = fork();
        if (pid < 0) {
            perror("fork");
            exit(1);
        } else if (pid == 0) {
            char buf;
            read(pipes[i][0], &buf, 1); // Wait for parent signal
            printf("I'm the child number %d (pid %d)\n", i, getpid());
            exit(0);
        }
    }

    for (int i = 0; i < NUM_CHILDREN; i++) {
        write(pipes[i][1], "x", 1);
        wait(NULL);
    }

    printf("Parent terminates (pid %d)\n", getpid());
}

// -------------------- FORK BOMB DEMO --------------------
void fork_bomb_demo() {
    printf("==> FORK BOMB DEMO (2^3 = 8 PROCESSES)\n");
    for (int i = 0; i < 3; i++) {
        fork();
        printf("Iteration %d -> PID %d\n", i, getpid());
    }
    sleep(1);
}

// -------------------- HELP --------------------
void show_help(const char *prog) {
    printf("Usage: %s [OPTION]\n", prog);
    printf("\nOptions:\n");
    printf("  -v1, --unordered    Run version 1 (unordered)\n");
    printf("  -v2, --sequential   Run version 2 (sequential ordered)\n");
    printf("  -v3, --parallel     Run version 3 (parallel ordered with pipes)\n");
    printf("  -a,  --all          Run all versions in sequence\n");
    printf("  -b,  --bomb         Run safe fork bomb demo (2^3 = 8 processes)\n");
    printf("  -h,  --help         Show this help message\n");
    printf("\nIf no option is provided, defaults to version 1.\n");
}

// -------------------- MAIN --------------------
int main(int argc, char *argv[]) {
    if (argc == 1) {
        version1(); // Default
    } else if ((strcmp(argv[1], "-v1") == 0) || (strcmp(argv[1], "--unordered") == 0)) {
        version1();
    } else if ((strcmp(argv[1], "-v2") == 0) || (strcmp(argv[1], "--sequential") == 0)) {
        version2();
    } else if ((strcmp(argv[1], "-v3") == 0) || (strcmp(argv[1], "--parallel") == 0)) {
        version3();
    } else if ((strcmp(argv[1], "-a") == 0) || (strcmp(argv[1], "--all") == 0)) {
        version1();
        version2();
        version3();
    } else if ((strcmp(argv[1], "-b") == 0) || (strcmp(argv[1], "--bomb") == 0)) {
        fork_bomb_demo();
    } else if ((strcmp(argv[1], "-h") == 0) || (strcmp(argv[1], "--help") == 0)) {
        show_help(argv[0]);
    } else {
        fprintf(stderr, "Unknown option: %s\n", argv[1]);
        show_help(argv[0]);
        exit(1);
    }
    return 0;
}
