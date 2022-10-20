package L_52;

public class main {
    public static void main(String[] args) {
        String s1 = "Hello, ";
        String s2 = "Pham Minh Quang";
        String s3 = s1 + s2;
        System.out.println("String: " + s3);

        // concat(): noi chuoi
        String s4 = s1.concat(s2);
        System.out.println("String 2: " + s4);

        // replaceAll(): thay the
        String s5 = s4.replaceAll("Hello", "Hi");
        System.out.println("String 3: " + s5);

        // toLowerCase: chuyen ve viet thuong
        // toUpperCase: chuyen ve viet hoa
        String s6 = s3.toLowerCase();
        String s7 = s3.toUpperCase();
        System.out.println("s6: " + s6 + " and s7: " + s7);

        // trim(): xoa bo cac khoang trong o dau chuoi
        String s8 = "       Yo, this is Kane.";
        System.out.println("Sau khi xoa cac khoang trong: " + s8.trim());

        // substring: cắt một đoạn rồi in đoạn đó ra.k
        String s9 = "A dracula is an evil";
        System.out.println("s9: " + s9.substring(5));
        String s10 = "0123456789";
        System.out.println("s10: " + s10.substring(1, 8));
    }
}
