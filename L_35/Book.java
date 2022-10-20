package L_35;

public class Book {
    private String bookName;
    private double price;
    private int dateOfPub;
    private Author authorName;

    public Book(String bn, double p, int dop, Author an) {
        this.bookName = bn;
        this.price = p;
        this.dateOfPub = dop;
        this.authorName = an;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bn) {
        this.bookName = bn;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(int p) {
        this.price = p;
    }

    public int getDateOfPub() {
        return this.dateOfPub;
    }

    public void setDateOfPub(int dop) {
        this.dateOfPub = dop;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(Author an) {
        this.authorName = an;
    }

    public void print() {
        System.out.println(this.bookName);
    }

    public boolean checkYear(Book otherBook) {
        return this.dateOfPub == otherBook.dateOfPub; // return true or false.
    }

    public double priceAfterReduction(double x) {
        return this.price * (1 - x / 100);
    }
}
