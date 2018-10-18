package Dana;

public class University {

    private int foundationYear;
    private String name;
    private Student[] students;

    public University(int foundationYear, String name, Student[] students) {
        this.foundationYear = foundationYear;
        this.name = name;
        this.students = students;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}