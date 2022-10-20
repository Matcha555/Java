package L_45;

public class bicycle extends vehicle {
    public bicycle(manufacturer manu) {
        super("Bicycle", manu);
    }

    @Override
    public double speed() {
        return 20;
    }
}
