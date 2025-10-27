import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner brother = new Scanner(System.in);
        Student[] students = new Student[3];
        Course[] courses = new Course[5];
        System.out.println("Enter 3 student ID and name:");
        for (int i = 0; i < 3; i++) {
            String ultimate = brother.nextLine().trim();
            int spaceIndex = ultimate.indexOf(" ");
            String studentID = ultimate.substring(0, spaceIndex);
            String name = ultimate.substring(spaceIndex+1);
            students[i] = new Student(studentID, name);
        }
        System.out.println("Enter 5 course ID, name and credit:");
        for (int i = 0; i < 5; i++) {
            String ultimate = brother.nextLine().trim();
            int spaceIndex = ultimate.indexOf(" ");
            int lastSpaceIndex = ultimate.lastIndexOf(" ");
            String courseID = ultimate.substring(0, spaceIndex);
            String courseName = ultimate.substring(spaceIndex+1, lastSpaceIndex);
            int credit = Integer.parseInt(ultimate.substring(lastSpaceIndex+1));
            courses[i] = new Course(courseID, courseName, credit);
        }
        for (Student student : students) {
            System.out.println(student.getName() + " grade report:");
            int counter = 0;
            while (counter < courses.length) {
                String ultimate = brother.nextLine().trim();
                if (ultimate.equals("x") || ultimate.equals("X")) { break; }
                int spaceIndex = ultimate.indexOf(" ");
                String courseID = ultimate.substring(0, spaceIndex);
                String grade = ultimate.substring(spaceIndex+1);
                boolean foundCourse = false;
                for (Course course : courses) {
                    if (courseID.equals(course.getCourseID())) {
                        student.addGradeReport(course, grade);
                        //System.out.println("Added " + courseID + " to " + student.getName() + "'s transcript.");
                        foundCourse = true;
                        counter++;
                    }
                }
                if (!foundCourse) { System.out.println("Could not find " + courseID + " in the subject list."); }
            }
        }
        for (Student student : students) {
            System.out.println("------ Transcript ------");
            System.out.println("  " + student.toString());
            for (CourseGrade courseGrade : student.getTranscript()) {
                System.out.println(courseGrade.toString());
            }
            System.out.printf("\n  GPA: %.2f\n\n", student.calGPA());
        }
    }
}
