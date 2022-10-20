package L_38;

public class computer {
    private manufacturer man;
    private date dat;
    private double price;
    private int insurance;

    public computer(manufacturer ma, date da, double p, int in) {
        this.man = ma;
        this.dat = da;
        this.price = p;
        this.insurance = in;
    }

    public manufacturer getMan() {
        return this.man;
    }

    public void setMan(manufacturer ma) {
        this.man = ma;
    }

    public date getDat() {
        return this.dat;
    }

    public void setDat(date da) {
        this.dat = da;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public int getInsurance() {
        return this.insurance;
    }

    public void setInsurance(int in) {
        this.insurance = in;
    }

    // hàm kiểm tra giá.
    public boolean checkPrice(computer otherComputer) {
        return this.price < otherComputer.price;
    }

    public String printCountryName() {
        return this.man.getManufacturerName();
    }

}
