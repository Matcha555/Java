package L_31;

public class CoffeeBill {
    private String name;
    private double price;
    private double weight;

    public CoffeeBill(String n, double p, double w) {
        this.name = n;
        this.price = p;
        this.weight = w;
    }

    // Do hàm này trả về số thực nên dùng: public double
    public double total() {
        return this.price * this.weight;
    }

    public boolean testHigherWeight(double w) {
        // if (this.weight > w)
        // return true;
        // else
        // return false;

        return this.weight > w; // Đoạn này sẽ trả về giá trị true hoặc false.
    }

    public boolean testTotal() {
        return this.total() > 500000;
    }

    public double sale(double x) {
        if (this.total() > 500000)
            return (x / 100) * this.total();
        else
            return 0;
    }

    public double giaSauKhiGiam(double x) {
        return this.total() - this.sale(x);
    }
}
