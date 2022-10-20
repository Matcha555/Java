package Array;

import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {
        double[] a; // = double a[];
        double b[];

        System.out.println("\n---Array a---");
        a = new double[5];
        Scanner pc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) // a.length: length of the array
        {
            System.out.print("Enter " + i + "th array: ");
            a[i] = pc.nextDouble(); // assign value to array
        }
        System.out.println("");
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            System.out.println("Sum = " + sum);
        }

        System.out.println("\n\n---Array b---");
        b = new double[] { 6, 7, 8, 9, 10 };
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        pc.close();

    }
}
