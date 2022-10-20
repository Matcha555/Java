package L_49;

import java.util.Scanner;

public class chuoi {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        String s = "Hello";
        System.out.print("Enter a string: ");
        s = pc.nextLine(); // Enter a string you want.
        System.out.println("\n" + s);

        System.out.println("------");

        System.out.println(s.length()); // Length of string s.
        int doDai = s.length();

        System.out.println("------");

        // charAt(direction) -> gets a character in a string
        for (int i = 0; i < doDai; i++) {
            System.out.println("Element " + i + " is " + s.charAt(i));
        }

        System.out.println("------");

        // getChars(): lay ky tu cua vi tri muon lay cua mang
        char[] array = new char[20];
        // getchars(vi tri mang muon lay, vi tri mang ket thuc - 1, mang khac de luu giu
        // lieu, vi tri bat dau luu mang khac)
        s.getChars(2, 6, array, 5);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }

        System.out.println("------");

        // getBytes
        byte[] mic = s.getBytes();
        for (byte b : mic) {
            System.out.println(b);
        }
    }
}
