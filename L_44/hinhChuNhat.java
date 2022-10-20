package L_44;

public class hinhChuNhat extends hinh {
    private double width, height;

    public hinhChuNhat(toaDo tod, double w, double h) {
        super(tod); // truyen toa do o tren.
        this.width = w;
        this.height = h;
    }

    @Override
    public double acreage() {
        return this.width * this.height;
    }

}
