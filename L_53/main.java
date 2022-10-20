package L_53;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Kieu nguyen thuy
        int[] a1 = { 1, 2, 3 };

        // Arrays.toString: copy mang va thay doi gia tri mang
        int[] a1_a = a1;
        a1_a[0] = 9; // gan gia tri tai vi tri thu 0 bang 9
        System.out.println("a1: " + Arrays.toString(a1)); // gia tri bi thay doi theo a1_a
        System.out.println("a1_a: " + Arrays.toString(a1_a));

        // clone(): copy mang va khong lam thay doi gia tri mang
        int[] a1_b = a1.clone();
        a1_b[1] = 51; // gan gia tri tai vi tri thu 1 bang 51
        System.out.println("a1: " + Arrays.toString(a1_b));

        /*
         * System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
         * length)
         * scr là mảng nguồn cần sao chép
         * srcPos là vị trí bắt đầu sao chép trong mảng nguồn
         * dest là mảng đích chứa kết quả sao chép
         * destPos là vị trí bắt đầu dán kết quả vào mảng đích
         * length là số phần tử được copy từ mảng nguồn
         */
        int[] a1_c = new int[a1.length];
        System.arraycopy(a1, 0, a1_c, 0, a1.length);
        a1_c[2] = 128;
        System.out.println("a1_c: " + Arrays.toString(a1_c));

        System.out.println("-------");

        String[] s1 = { "I'm Quang, a businessman." };

        String[] s2 = s1;
        s2[5] = "j";
        System.out.println("s1: " + Arrays.toString(s1));
        System.out.println("s2: " + Arrays.toString(s2));
    }
}