package academic.model;

public class Student {
    private String nim;
    private String name;
    private String year;
    private String studyProgram;

    // Constructor
    public Student(String nim, String name, String year, String studyProgram) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.studyProgram = studyProgram;
    }

    // Mengubah format output menjadi NIM|Name|Year|StudyProgram
    @Override
    public String toString() {
        return nim + "|" + name + "|" + year + "|" + studyProgram;
    }
}