import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String courseID, grade;
        double credit = 0, creditSum = 0,gradeNo = 0, gradeSum = 0;
        boolean interrupt = false, gradeErr = false;
        Scanner brother = new Scanner(System.in);
        System.out.println("Enter course ID, credit and grade; or X to terminate");
        while (!interrupt) {
            courseID = brother.next();
            switch (courseID) {
                case "x" -> {
                    creditSum = (creditSum == 0) ? 1 : creditSum;
                    System.out.println("GPA = " + gradeSum / creditSum);
                    interrupt = true;
                }
                default -> {
                    credit = brother.nextDouble();
                    grade = brother.next();
                    gradeErr = false;
                    switch (grade) {
                        case "A+", "A-", "A" -> gradeNo = 4.0;
                        case "B+" -> gradeNo = 3.5;
                        case "B-", "B" -> gradeNo = 3.0;
                        case "C+" -> gradeNo = 2.5;
                        case "C-", "C" -> gradeNo = 2.0;
                        case "D+" -> gradeNo = 1.5;
                        case "D-", "D" -> gradeNo = 1.0;
                        case "F" -> gradeNo = 0;
                        default -> {
                            System.out.println("Invalid grade format, please try again");
                            gradeErr = true;
                        }
                    }
                }
            }
            if (!gradeErr) {
                creditSum += credit;
                gradeSum += gradeNo * credit;
            }
        }
    }
}
