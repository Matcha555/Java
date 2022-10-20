package L_45;

public class manufacturer {
    private String manuName, countryName;

    public manufacturer(String mn, String cn) {
        this.manuName = mn;
        this.countryName = cn;
    }

    public String getManuName() {
        return this.manuName;
    }

    public void setManuName(String mn) {
        this.manuName = mn;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String cn) {
        this.countryName = cn;
    }

}
