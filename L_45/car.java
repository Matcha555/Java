package L_45;

public class car extends vehicle {
    private String material;

    public car(manufacturer manu, String ma) {
        super("Car", manu);
        this.material = ma;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String ma) {
        this.material = ma;
    }

    @Override
    public double speed() {
        return 120;
    }
}
