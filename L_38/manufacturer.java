package L_38;

public class manufacturer {
    private String manufacturerName;
    private country cot;

    public manufacturer(String mn, country ct) {
        this.manufacturerName = mn;
        this.cot = ct;
    }

    public String getManufacturerName() {
        return this.manufacturerName;
    }

    public void setManufacturerName(String mn) {
        this.manufacturerName = mn;
    }

    public country cot() {
        return this.cot;
    }

    public void cot(country ct) {
        this.cot = ct;
    }
}
