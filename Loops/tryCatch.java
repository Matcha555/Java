package Loops;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int n = 0;

        try {
            System.out.print("Enter n: ");
            n = pc.nextInt();

            System.out.println("n = " + n);

        } catch (Exception e) {
            System.out.println("Incorrect data entry!");
        }

        System.out.println("Exit the program!");
        pc.close();
    }
}
