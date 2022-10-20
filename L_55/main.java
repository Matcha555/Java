package L_55;

import java.util.Arrays;

//Tim kiem, sap xep, copy mang bang cac ham co san

public class main {

    public static int[] reverse(int[] x) {
        int[] rs = new int[x.length]; // tao mang moi = do dai cua mang x
        int index = 0;
        for (int i = x.length - 1; i >= 0; i--) // chay tu phia sau len truoc
        {
            rs[index] = x[i];
            index++;
        }
        return rs;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 9, 8, 2, 4, 5, 3 };
        int[] b = new int[10];

        // Ham sap xep tang dan
        Arrays.sort(a); // Ham sort mac dinh sap xep tu tang dan
        System.out.println("a sau khi sap xep: " + Arrays.toString(a));

        // Ham tim kiem
        // binarySearch chi duoc thuc hien khi mang duoc sap xep.
        System.out.println("Position: " + Arrays.binarySearch(a, 3));
        System.out.println("Position: " + Arrays.binarySearch(a, -1));

        // Ham dien gia tri
        Arrays.fill(b, 9);
        System.out.println("Array b: " + Arrays.toString(b));

        // Ham sap xep giam dan
        Arrays.sort(a);
        a = main.reverse(a);
        System.out.println("Reverse array a: " + Arrays.toString(a));
    }
}
