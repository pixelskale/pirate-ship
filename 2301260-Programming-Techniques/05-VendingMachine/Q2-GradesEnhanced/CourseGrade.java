public class CourseGrade {
    private Course course;
    private String grade;
    public CourseGrade(Course course, String grade) {
        this.course = course;
        this.grade = grade;
    }
    public Course getCourse() {
        return course;
    }
    public String getGrade() {
        return grade;
    }
    public double getGradeNo() {
        double gradeNo = 0;
        boolean gradeErr = false;
        switch (this.getGrade()) {
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
        return gradeNo;
    }
    public double getGradeValue() {
        return this.getGradeNo() * this.getCourse().getCredit();
    }
    public int getGradeCredit() {
        return this.getCourse().getCredit();
    }
    public String toString() {
        return course.getCourseID() + " " + course.getCourseName() + " " + course.getCredit() + " " + this.getGrade();
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
