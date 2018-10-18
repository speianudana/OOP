package Dana;

public class Main {

    public static void main(String[] args) {
        System.out.println("Average media for all students from all universities is: " + String.format("%.02f", calculateAverage(populateWithDemoData())));

    }

    private static University[] populateWithDemoData() {
        Student utmStudent1 = new Student("Dana Speianu", 20, 10.00f);
        Student utmStudent2 = new Student("Dumitru Boi?teanu", 21, 10.00f);
        Student utmStudent3 = new Student("Ion Brînza", 20, 9.5f);

        Student[] utmStudents = {utmStudent1, utmStudent2, utmStudent3};

        Student usmStudent1 = new Student("Dan Borta", 20, 5.00f);
        Student usmStudent2 = new Student("Vasile Crudu", 19, 6.00f);
        Student usmStudent3 = new Student("Ianis Speianu", 30, 9.7f);

        Student[] usmStudents = {usmStudent1, usmStudent2, usmStudent3};

        Student asemStudent1 = new Student("Grigore Dilion", 20, 7.00f);
        Student asemStudent2 = new Student("Ana Doper", 20, 5.00f);
        Student asemtudent3 = new Student("Patricia Cazacu", 20, 8.00f);

        Student[] asemStudents = {asemStudent1, asemStudent2, asemtudent3};

        University utm = new University(1964, "UTM", utmStudents);
        University usm = new University(1946, "USM", usmStudents);
        University asem = new University(1991, "ASEM", asemStudents);

        University[] universities = new University[3];
        universities[0] = utm;
        universities[1] = usm;
        universities[2] = asem;
        return universities;
    }

    private static float calculateAverage(University[] universities) {
        float studentsMarkSum = 0;
        int numberOfStudents = 0;
        for (University university : universities) {
            Student[] students = university.getStudents();
            for (Student student : students) {
                studentsMarkSum = student.getMark() + studentsMarkSum;
            }
            numberOfStudents = university.getStudents().length + numberOfStudents;
        }
        return studentsMarkSum / numberOfStudents;
    }
}