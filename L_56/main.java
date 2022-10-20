package L_56;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String s = "Hello, I'm Joker";

        String[] a = s.split(" "); // cắt chuỗi dựa trên dấu cách.

        System.out.println(Arrays.toString(a)); // Hello,, I'm, Joker

        // In từng phần tử
        for (String t : a) {
            System.out.println(t);
            /*
             * Hello,
             * I'm
             * Joker
             */
        }

        // In một từ trong chuỗi
        System.out.println("a[2] = " + a[2]); // VD: in từ vị trí thứ 1 trong chuỗi a -> Joker

        System.out.println("--------------");

        String c = "Hi, I'm Quang, a bussinessman in the future. Never give up.";
        String[] d = c.split("\\.|\\,"); // cắt chuỗi dựa trên dấu chấm hoặc dấu phẩy.

        for (String t2 : d) {
            System.out.println(t2);
            /*
             * Hi
             * I'm Quang
             * a bussinessman in the future
             * Never give up
             */
        }

        System.out.println("--------------");

        String e = "Pham Minh Quang.";
        String[] f = e.split(" ");
        System.out.println(Arrays.toString(f));
        System.out.println("Name: " + f[f.length - 1]); // Lấy từ cuối
    }
}
