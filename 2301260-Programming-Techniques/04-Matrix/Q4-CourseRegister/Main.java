import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner brother = new Scanner(System.in);
        CourseRegister progTech = new CourseRegister("2301260");
        while (true) {
            System.out.println("Enter ID, name, major");
            String input = brother.nextLine();
            if (input.equals("x") || input.equals("X")) { break; }
            String[] arrInput = input.split("\\s+");
            if (progTech.register(new Student(arrInput[1] + " " + arrInput[2], arrInput[0], arrInput[3]))) {
                System.out.println(arrInput[0] + " REGISTERED SUCCESSFULLY");
            } else { System.out.println(arrInput[0] + " ALREADY REGISTERED"); }
        }
        progTech.printReg();
        System.out.println("Drop student -> Enter ID of the student:");
        String input = brother.nextLine();
        if (progTech.drop(input)) {
            System.out.println(input + " DROPPED SUCCESSFULLY");
        } else { System.out.println(input + " NOT REGISTERED"); }
        progTech.printReg();
    }
}
