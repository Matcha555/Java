package L_55;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        student st1 = new student(412, "Pham Son", "OSG202", 9.1);
        student st2 = new student(723, "Le Tu Ong", "smk999", 5.16);
        student st3 = new student(824, "Doan Trieu Dieu Anh", "uaj281", 7.2);
        student st4 = new student(975, "Tran Minh", "82hjs", 2.5);

        student[] st = new student[] { st1, st2, st3, st4 };

        // System.out.println(Arrays.toString(st));

        // ham sap xep
        Arrays.sort(st);
        System.out.println(Arrays.toString(st));

        // tim kiem
        System.out.println("Vi tri sinh vien: " + Arrays.binarySearch(st, st4));
    }
}
