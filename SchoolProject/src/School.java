import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String schoolName;
    private boolean isSecondarySchool;
    private int yearEst;

    public School(String schoolName, boolean isSecondarySchool, int yearEst) {
        this.schoolName = schoolName;
        this.isSecondarySchool = isSecondarySchool;
        this.yearEst = yearEst;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(int i){
        teachers.remove(i);
    }

    public void addStudents (Student student){
        students.add(student);
    }

    public void removeStudent(int i){
        students.remove(i);
    }
    public ArrayList allTeachers(){
        return teachers;
    }

    public ArrayList allStudents(){
        return students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public boolean isSecondarySchool() {
        return isSecondarySchool;
    }

    public void setIsSecondarySchool(boolean aSecondarySchool) {
        isSecondarySchool = aSecondarySchool;
    }

    public int getYearEst() {
        return yearEst;
    }

    public void setYearEst(int yearEst) {
        this.yearEst = yearEst;
    }
}
