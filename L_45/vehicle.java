package L_45;

public abstract class vehicle {
    protected String veName;
    protected manufacturer manufa;

    public vehicle(String vn, manufacturer manu) {
        this.veName = vn;
        this.manufa = manu;
    }

    public String getVeName() {
        return this.veName;
    }

    public void setVeName(String vn) {
        this.veName = vn;
    }

    // VD: co 3 kieu loai phuong thuc

    // Phuong thuc 1:
    public String manufacturerName() {
        // vi o trong class manufactuter da co geter va seter nen bay gio chi can
        // return.
        return this.manufa.getManuName();
    }

    // Phuong thuc 2:
    public void start() {
        System.out.println("Start ....  ");
    }

    public void acceleration() {
        System.out.println("Rrrrrr......  ");
    }

    public void stop() {
        System.out.println("Stop..... ");
    }

    // Phuong thuc 3:
    public abstract double speed();

}
