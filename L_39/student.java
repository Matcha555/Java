package L_39;

public class student extends person // lớp student kế thừa lớp person.
{
    private int studentId;
    private String studentClass;

    public student(String n, int a, float w, int si, String cl) {
        super(n, a, w);
        this.studentId = si;
        this.studentClass = cl;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int si) {
        this.studentId = si;
    }

    public String setStudentClass() {
        return this.studentClass;
    }

    public void setStudentClass(String cl) {
        this.studentClass = cl;
    }

    public void homeWork() {
        System.out.println(" ... ... ...");
    }
}
