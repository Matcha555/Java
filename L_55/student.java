package L_55;

public class student implements Comparable<student> {
    private int studentID;
    private String name;
    private String tenLop;
    private double average;

    public student(int si, String n, String tl, double av) {
        this.studentID = si;
        this.name = n;
        this.tenLop = tl;
        this.average = av;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int si) {
        this.studentID = si;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tl) {
        this.tenLop = tl;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double av) {
        this.average = av;
    }

    public String cpn() {
        String s1 = this.name.trim();
        if (s1.indexOf(" ") >= 0) {
            int po = s1.lastIndexOf(" "); // po: tim vi tri khoang trong cuoi cung
            /*
             * VD: Pham Minh Quang -> Sau khi tim duoc khong trong o vi tri
             * 9, thi (po + 1) co nghia la lay vi tri sau khong trong.(chu Q)
             */
            return s1.substring(po + 1);
        } else {
            return s1;
        }
    }

    @Override
    public String toString() {
        return "[average=" + average + ", name=" + name + ", studentID=" + studentID + ", tenLop=" + tenLop + "]";
    }

    // Ham so sanh
    @Override
    public int compareTo(student o) {

        // return this.studentID - o.studentID; //so sanh mssv
        String nameThis = this.cpn();
        String nameO = o.cpn();

        return nameThis.compareTo(nameO); // so sanh ten
    }

}
