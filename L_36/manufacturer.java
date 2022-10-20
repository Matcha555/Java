package L_36;

public class manufacturer {
    private String manufacturerName;
    private String country;

    public manufacturer(String mn, String c) {
        this.manufacturerName = mn;
        this.country = c;
    }

    // Hàm lấy tên hãng sản xuất
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String mn) {
        this.manufacturerName = mn;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String c) {
        this.country = c;
    }
}
