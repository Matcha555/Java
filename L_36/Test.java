package L_36;

public class Test {
    public static void main(String[] args) {
        Day dt = new Day(12, 3, 1978);
        Day dt1 = new Day(31, 6, 1992);
        Day dt2 = new Day(12, 3, 1978);

        manufacturer m1 = new manufacturer("The Tom Hanks", "America");
        manufacturer m2 = new manufacturer("James Bond", "Switzerland");
        manufacturer m3 = new manufacturer("Matcha corporation", "Viet Nam");

        film f1 = new film("Avatar", 1991, m1, 132000, dt2);
        film f2 = new film("Titanic", 1977, m3, 200000, dt);
        film f3 = new film("Avengers", 1987, m2, 56000, dt1);

        System.out.println("Check price f2 and f1: " + f2.checkPrice(f1));
        System.out.println("Check price f1 and f3: " + f1.checkPrice(f3));
        System.out.println("Check price f3 and f2: " + f3.checkPrice(f2));

        System.out.println("Distributed by: " + f2.movieName());
        System.out.println("Distributed by: " + f3.movieName());
        System.out.println("Distributed by: " + f1.movieName());

        System.out.println("Promotion: " + f1.promotion(44));
        System.out.println("Promotion: " + f1.promotion(15));
        System.out.println("Promotion: " + f1.promotion(20));
    }
}
