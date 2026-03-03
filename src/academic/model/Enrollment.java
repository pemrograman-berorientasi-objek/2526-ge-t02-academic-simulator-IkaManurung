package academic.model;

public class Enrollment {
    private String courseCode;
    private String nim;
    private String academicYear;
    private String semester;
    private String grade;

    // Constructor menerima 4 data dari input, grade otomatis diset "None"
    public Enrollment(String courseCode, String nim, String academicYear, String semester) {
        this.courseCode = courseCode;
        this.nim = nim;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None"; 
    }

    // Mengubah format output menggunakan pemisah "|"
    @Override
    public String toString() {
        return courseCode + "|" + nim + "|" + academicYear + "|" + semester + "|" + grade;
    }
}