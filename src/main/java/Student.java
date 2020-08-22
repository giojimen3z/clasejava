
public class Student extends Person {

    private String faculty;
    private int semester;
    private int subjectNumbers;
    private double gradeSubject;
    private double average;

    public Student(String id, String name, String lastName, int age, String birthDate, String email, String institution, String eps, String faculty, int semester, int subjectNumbers, double gradeSubject, double average) {
        super(id, name, lastName, age, birthDate, email, institution, eps);
        this.faculty = faculty;
        this.semester = semester;
        this.subjectNumbers = subjectNumbers;
        this.gradeSubject = gradeSubject;
        this.average = average;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSubjectNumbers() {
        return subjectNumbers;
    }

    public void setSubjectNumbers(int subjectNumbers) {
        this.subjectNumbers = subjectNumbers;
    }

    public double getGradeSubject() {
        return gradeSubject;
    }

    public void setGradeSubject(double gradeSubject) {
        this.gradeSubject = gradeSubject;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
