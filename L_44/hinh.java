package L_44;

public abstract class hinh {
    protected toaDo tod;

    public hinh(toaDo td) {
        this.tod = td;
    }

    public toaDo getTod() {
        return this.tod;
    }

    public void setTod(toaDo td) {
        this.tod = td;
    }

    public abstract double acreage();

}
