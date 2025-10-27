import java.util.ArrayList;

public class Student {
    private String studentID;
    private String name;
    private ArrayList<CourseGrade> transcript = new ArrayList<CourseGrade>();
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    public String getID() {
        return this.studentID;
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<CourseGrade> getTranscript() {
        return transcript;
    }
    public void setID(String studentID) {
        this.studentID = studentID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return (this.studentID + " " + this.name);
    }
    public void addGradeReport(Course c, String g) {
        this.transcript.add(new CourseGrade(c, g));
    }
    public double calGPA() {
        double valueSum = 0;
        int creditSum = 0;
        for (CourseGrade report : transcript) {
            valueSum += report.getGradeValue();
            creditSum += report.getGradeCredit();
        }
        return valueSum / creditSum;
    }
}
