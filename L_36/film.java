package L_36;

public class film {
    private String filmName;
    private int releaseDate;
    private manufacturer manufacturerFilm;
    private double price;
    private Day date;

    public film(String fn, int r, manufacturer mf, double p, Day da) {
        this.filmName = fn;
        this.releaseDate = r;
        this.manufacturerFilm = mf;
        this.price = p;
        this.date = da;
    }

    public String getFilmName() {
        return this.filmName;
    }

    public void setFilmName(String fn) {
        this.filmName = fn;
    }

    public int getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(int r) {
        this.releaseDate = r;
    }

    public manufacturer getManufacturerFilm() {
        return this.manufacturerFilm;
    }

    public void setManufacturerFilm(manufacturer mf) {
        this.manufacturerFilm = mf;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public Day getDate() {
        return this.date;
    }

    public void setDate(Day da) {
        this.date = da;
    }

    // Hàm kiểm tra giá phim có lớn hơn hay nhỏ hơn giá phim khác không
    public boolean checkPrice(film otherFilm) {
        return this.price < otherFilm.price;
    }

    // lấy tên hãng sản xuất
    public String movieName() {
        return this.manufacturerFilm.getManufacturerName();
    }

    public double promotion(double x) {
        return this.price * (1 - x / 100);
    }
}
