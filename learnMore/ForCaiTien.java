package learnMore;

import java.util.Scanner;

public class ForCaiTien {
    public static void main(String[] args) {
        int[] arr;
        int size = 5; // kich thuoc
        arr = new int[size];
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.format("array %d: ", i + 1); // i: phần tử thứ..., rồi thế vào %d.
            arr[i] = pc.nextInt();
        }

        // Hiện thị dữ liệu mảng
        System.out.print("-> Array: ");
        // Khi mà thao tác với mảng trong đó các phần tử của mảng KHÔNG CÓ SỰ THAY ĐỔI
        // VỀ MẶT GIÁ TRỊ nên dùng vòng lặp FOR cải tiến
        for (int i : arr) /*
                           * (1)
                           * mảng arr có kiểu int. Cứ mỗi lần lặp, chương trình vào mảng arr để lấy một
                           * phần tử trong mảng đó(lấy giá trị của mảng đấy) đưa vào biến i
                           * Đầu tiên lấy phần tử đầu tiên của mảng arr đưa vào i, rồi thực hiện bước (2)
                           */

        {
            System.out.print(i + " "); // (2): sau đó in phần tử thứ nhất ra, rồi quay lại bước (1), cứ thực hiện như
                                       // thế cho đến cuối mảng thì dừng.
        }

        // Tìm MAX
        int max;
        max = arr[0]; // đặt max = phần tử đầu tiên của mảng arr;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("\n-> max: " + max);

        // Tìm số chính phương
    }
}
