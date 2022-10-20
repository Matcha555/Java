package L_44;

public class hinhTron extends hinh {
    private double r; // r: ban kinh hinh tron

    public hinhTron(toaDo td, double r) {
        super(td);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double acreage() {
        return Math.PI * r * r;
    }
}
