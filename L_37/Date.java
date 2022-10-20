package L_37;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int d) {
        this.day = d;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int m) {
        this.month = m;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int y) {
        this.year = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(getClass() == obj.getClass())) {
            return false;
        }
        Date other = (Date) obj;
        if (day != other.day)
            return false;
        if (month != other.month)
            return false;
        if (year != other.year)
            return false;

        return true;
    }
}
