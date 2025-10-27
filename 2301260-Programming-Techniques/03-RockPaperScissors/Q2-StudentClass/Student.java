public class Student {
    private String name;
    private String studentID;
    private String major;
    // Empty Constructor
    public Student() {}
    // Overloaded Constructor
    public Student(String name, String studentID, String major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }
    public void setID(String studentID) {
        this.studentID = studentID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getID() {
        return this.studentID;
    }
    public String getName() {
        return this.name;
    }
    public String getMajor() {
        return this.major;
    }
    public String toString() {
        return (this.name + " " + this.studentID + " " + this.major);
    }
    public boolean equals(Student other) {
        boolean boolName = this.name.equals(other.name);
        boolean boolID = this.studentID.equals(other.studentID);
        boolean boolMajor = this.major.equals(other.major);
        return boolName && boolID && boolMajor;
    }
    private int getDigit(int pos1, int pos2) {
        return Integer.parseInt(this.studentID.substring(pos1, pos2+1));
    }
    public int getYear() {
        return this.getDigit(0, 1);
    }
    public int getLevelCode() {
        return this.getDigit(2, 2);
    }
    public int getFacultyCode() {
        return this.getDigit(8, 9);
    }
    public boolean sameYear(Student other) {
        return (this.getYear() == other.getYear());
    }
    public boolean sameLevel(Student other) {
        return (this.getLevelCode() == other.getLevelCode());
    }
    public boolean sameFaculty(Student other) {
        return (this.getFacultyCode() == other.getFacultyCode());
    }
}
