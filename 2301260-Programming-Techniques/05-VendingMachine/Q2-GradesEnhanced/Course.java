public class Course {
    private String courseID;
    private String courseName;
    private int credit;
    public Course(String courseID, String courseName, int credit) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credit = credit;
    }
    public String getCourseID() {
        return courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getCredit() {
        return credit;
    }
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
}
