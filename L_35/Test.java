package L_35;

public class Test {
    public static void main(String[] args) {
        Day day1 = new Day(12, 3, 1975);
        Day day2 = new Day(6, 9, 1956);
        Day day3 = new Day(12, 3, 1967);

        Author author1 = new Author("Pham Minh Quang", day3);
        Author author2 = new Author("Bill Gates", day2);
        Author author3 = new Author("Doan Trieu Dieu Anh", day1);

        Book book1 = new Book("Lord of the kingdom", 145000, 1994, author3);
        Book book2 = new Book("My dream comes true", 210000, 1987, author1);
        Book book3 = new Book("A beautiful picture", 650000, 1994, author2);

        book1.print();
        book2.print();
        book3.print();

        System.out.println("Compare book1 and book2: " + book1.checkYear(book2));
        System.out.println("Compare book2 and book3: " + book2.checkYear(book3));
        System.out.println("Compare book3 and book1: " + book3.checkYear(book1));

        System.out.println("Price after reduction: " + book1.priceAfterReduction(10));
        System.out.println("Price after reduction: " + book2.priceAfterReduction(20));
        System.out.println("Price after reduction: " + book3.priceAfterReduction(30));
    }
}
