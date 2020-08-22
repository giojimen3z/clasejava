public class Person {

    private String id;
    private String name;
    private String lastName;
    private int age;
    private String birthDate;
    private String email;
    private String institution;
    private String eps;


    public Person(String id, String name, String lastName, int age, String birthDate, String email, String institution, String eps) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
        this.email = email;
        this.institution = institution;
        this.eps = eps;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

}
