package L_37;

public class Student {
    private String studentID;
    private String studentName;
    private Date dat;
    private double average;
    private Class cla;

    public Student(String si, String sn, Date da, double ave, Class cl) {
        this.studentID = si;
        this.studentName = sn;
        this.dat = da;
        this.average = ave;
        this.cla = cl;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String si) {
        this.studentID = si;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String sn) {
        this.studentName = sn;
    }

    public Date getDat() {
        return this.dat;
    }

    public void setDat(Date da) {
        this.dat = da;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(int ave) {
        this.average = ave;
    }

    public Class getCla() {
        return this.cla;
    }

    public void setClas(Class cl) {
        this.cla = cl;
    }

    public String printMajor() {
        return this.cla.getMajor();
    }

    public boolean checkAverage(double x) {
        return this.average >= 5.0;
    }

    public boolean checkDate(Student otherStudent) {
        return this.dat.equals(otherStudent.dat);
    }
}
