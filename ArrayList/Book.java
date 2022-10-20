package ArrayList;

public class Book {
    private String name;
    private int code;
    private double price;
    private String brand;

    public Book() {
    } // constructor không tham số

    // constructor có không tham số, ,mục đích chính là dể truyền dữ liệu
    public Book(String name, int code, double price, String brand) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        // return name + "\t" + code + "\t" + price + "\t" + brand;
        return String.format("%10s%5d%14f%20s", name, code, price, brand); // %20s: 10 ô trống(string name);
                                                                           // %5d: 5 ô trống(int code),
                                                                           // %14f: 14 ô trống(double price).
    }

}