import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner brother = new Scanner(System.in);
        System.out.println("Student 1: Enter ID, name, major");
        String input1 = brother.nextLine();
        System.out.println("Student 2: Enter ID, name, major");
        String input2 = brother.nextLine();
        String[] arrInput1 = input1.split("\\s+");
        String[] arrInput2 = input2.split("\\s+");
        Student student1 = new Student(arrInput1[1], arrInput1[0], arrInput1[2]);
        Student student2 = new Student(arrInput2[1], arrInput2[0], arrInput2[2]);
        String resultYear = (student1.sameYear(student2)) ? "Same" : "Different"; // Capitalized
        String resultLevel = (student1.sameLevel(student2)) ? "same" : "different";
        String resultFaculty = (student1.sameFaculty(student2)) ? "same" : "different";
        System.out.printf("%s year, %s level, %s faculty\n", resultYear, resultLevel, resultFaculty);
    }
}
