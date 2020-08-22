public class Teacher extends Person {

    private String Program;
    private String faculty;
    private int subjectsNumber;
    private String subjects[];
    private int studentNumber;

    public Teacher(String id, String name, String lastName, int age, String birthDate, String email, String institution, String eps, String program, String faculty, int subjectsNumber, String[] subjects, int studentNumber) {
        super(id, name, lastName, age, birthDate, email, institution, eps);
        Program = program;
        this.faculty = faculty;
        this.subjectsNumber = subjectsNumber;
        this.subjects = subjects;
        this.studentNumber = studentNumber;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getSubjectsNumber() {
        return subjectsNumber;
    }

    public void setSubjectsNumber(int subjectsNumber) {
        this.subjectsNumber = subjectsNumber;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void setEps(String eps) {
        super.setEps(eps);
    }
}
