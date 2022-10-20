package L_30;

public class myDate {
    private int day;
    private int month;
    private int year;

    public myDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void print() {
        System.out.println("Day: " + this.day);
        System.out.println("Month: " + this.month);
        System.out.println("Year: " + this.year);
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}
