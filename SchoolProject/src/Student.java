public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int id;

    public Student(String firstName, String lastName, int grade, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade;
    }
}
