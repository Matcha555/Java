package Assignment;

public class frame {
    private String ID;
    private String make;
    private double length;
    private double width;
    private double price;

    public frame(String i, String m, double l, double w, double p) {
        this.ID = i;
        this.make = m;
        this.length = l;
        this.width = w;
        this.price = p;
    }

    public void update(String m, double l, double w, double p) {
        this.make = m;
        this.length = l;
        this.width = w;
        this.price = p;
    }

    public String getID() {
        return ID;
    }

    public void setID(String i) {
        ID = i;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String m) {
        this.make = m;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        this.length = l;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void print() {
        System.out.println("Product(" + "ID: " + ID + ", make: " + make + ", length: " + length + ", width: " + width
                + ", price: " + price + ")");
    }

}
