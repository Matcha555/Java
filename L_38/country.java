package L_38;

public class country {
    private String countryName;
    private String countryCode;

    public country(String cn, String cc) {
        this.countryName = cn;
        this.countryCode = cc;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String cn) {
        this.countryName = cn;
    }

    public String getcountryCode() {
        return this.countryCode;
    }

    public void getcountryCode(String cc) {
        this.countryCode = cc;
    }

}
