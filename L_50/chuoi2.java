package L_50;

public class chuoi2 {
    public static void main(String[] args) {
        String s1 = "Money";
        String s2 = "moNEy";
        String s3 = "Money";

        // equals: so sanh 2 chuoi co giong nhau khong, phan biet hoa thuong va viet hoa
        System.out.println("s1 and s2: " + s1.equals(s2)); // flase
        System.out.println("s3 and s1: " + s3.equals(s1)); // true
        System.out.println("s2 and s3: " + s2.equals(s3)); // fasle

        System.out.println("------");

        // equalsIgnoreCase: khong phan biet hoa thuong va viet hoa.
        System.out.println("s1 and s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s3 and s1: " + s3.equalsIgnoreCase(s1));
        System.out.println("s2 and s3: " + s2.equalsIgnoreCase(s3));

        System.out.println("------");

        // compareTo -> so sanh > < =
        String sv1 = "Le Van A";
        String sv2 = "Ho Trong B";
        String sv3 = "Le Van C";
        System.out.println("s1 and s2: " + sv1.compareTo(sv2)); // L(76) - H(72) = 4 (Bang ma Ascii)
        System.out.println("s3 and s1: " + sv3.compareTo(sv1)); // C(67) - A(65) = 2

        // compareToIgnoreCase -> giong ham compareTo, khong phan biet hoa thuong va in
        // hoa.

        System.out.println("------");
        // regionMatches -> so sanh mot doan
        String m1 = "Minh Quang";
        String m2 = "nh Q";
        // regionMatches()
        boolean check = m1.regionMatches(2, m2, 1, 4);
        System.out.println(check); // -> true

        System.out.println("------");

        // startWith -> Ham kiem tra chuoi bat dau bang...
        String pho = "mi99ckey";
        System.out.println("Check pho: " + pho.startsWith("mi99")); // true
        System.out.println("Check pho: " + pho.startsWith("mi82")); // false

        System.out.println("------");

        // endWith() -> Ham kiem tra ket thuc chuoi bang...
        String car = "Bentley";
        String car2 = "Ferrari";
        System.out.println("Check car: " + car.endsWith("ley")); // true
        System.out.println("Check car: " + car.endsWith("may")); // false

        if (car.endsWith("ley")) {
            System.out.println("This is Bentley.");
        } else if (car.endsWith("ari")) {
            System.out.println("This is Ferrari.");
        }

        if (car2.endsWith("ari")) {
            System.out.println("This is Ferrari.");
        } else if (car2.endsWith(".PDF")) {
            System.out.println("This is Bentley.");
        }
    }
}
