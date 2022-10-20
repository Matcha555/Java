package L_45;

public class plane extends vehicle {
    private String material;

    public plane(manufacturer manu, String m) {
        super("Air Force 445", manu);
        this.material = m;
    }

    public String getMarterial() {
        return material;
    }

    public void setMaterial(String m) {
        this.material = m;
    }

    @Override
    public double speed() {
        return 500; // lay van toc: 500k/h
    }

    public void fly() {
        System.out.println("Viuuuuuuuu......");
    }

    public void down() {
        System.out.println("Uuuuuuu......");
    }
}
