package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // int count = 1; // Biến đếm
        // do {
        // System.out.println("Count is: " + count);
        // count++;
        // } while (count <= 0);
        Scanner pc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a value: ");
            n = pc.nextInt();

            System.out.println("n = " + n);
        } while (n != 0);
        pc.close();

    }
}