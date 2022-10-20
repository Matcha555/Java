package Array;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        /*
         * // kieu[][] array_name;
         * boolean[][] check;
         * int[][] matrix = {
         * { 1, 2, 3 },
         * { 4, 5, 6 },
         * { 7, 8, 9 }
         * };
         * 
         * check = new boolean[6][5];
         * check[0][1] = true;
         * check[5][4] = false;
         * 
         * for (int i = 0; i < matrix.length; i++) {
         * for (int j = 0; j < matrix[0].length; j++) {
         * 
         * }
         * }
         * 
         */

        int m = 0, n = 0;
        Scanner pc = new Scanner(System.in);
        System.out.print("\nEnter the rows(m): ");
        m = pc.nextInt();
        System.out.print("Enter the columns(n): ");
        n = pc.nextInt();

        // khai bao + khoi tao mang 2 chieu.
        int a[][] = new int[m][n];
        System.out.print("Enter elements: \n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = pc.nextInt();
            }
        }

        // Hien thi mang/truy xuat cac phan tu
        System.out.println("\n- Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
