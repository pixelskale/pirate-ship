import java.util.ArrayList;

public class CourseRegister {
    private String courseID;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    public CourseRegister(String courseID) {
        this.courseID = courseID;
    }
    public boolean register(Student other) {
        boolean foundID = false;
        for (Student registered : this.studentList) {
            if (registered.getID().equals(other.getID())) {
                foundID = true;
            }
        }
        if (!foundID) { this.studentList.add(other); }
        return !foundID;
    }
    public boolean drop(String studentID) {
        int targetIndex = 0;
        boolean foundID = false;
        for (Student registered : this.studentList) {
            if (registered.getID().equals(studentID)) {
                targetIndex = this.studentList.indexOf(registered);
                foundID = true;
            }
        }
        if (foundID) { this.studentList.remove(targetIndex); }
        return foundID;
    }
    public void printReg() {
        System.out.println(courseID);
        for (Student registered : this.studentList) {
            System.out.println(registered.getID() + " " + registered.getName());
        }
        System.out.println("Total students in this course: " + this.studentList.size());
    }
}
