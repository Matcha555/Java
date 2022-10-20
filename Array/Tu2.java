package Array;

public class Tu2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] friends = { "Quang", "Dieu Anh", "Musk" };
        float[] marks = { 5.3f, 6.7f, 9.2f };

        System.out.println("Length of array: " + numbers.length);
        System.out.println("Length of array: " + friends.length);
        System.out.println("Length of array: " + marks.length);

        System.out.println();
        // System.out.println(friends[2]); // In phan tu theo vi tri ra man hinh.
        // friends[2] = "Bill Gates"; // thay doi gia tri vi tri thu 2 cua mang
        // System.out.println(friends[2]);

        // Ham duyet het mang.
        for (int i = 0; i < friends.length; i++) {
            System.out.println("friends[" + i + "] = " + friends[i]);
        }

        int[] array = new int[100];
        // System.out.println(array[0]);
        // System.out.println(array[10]);

        String[] str = new String[20];
        str[19] = "Hi everyone";
        System.out.println(str[19]);

        boolean[] bools = new boolean[200];
        bools[9] = false; // tu gan gia tri cho phan tu
        bools[5] = true; // tu gan gia tri cho phan tu
        System.out.println(bools[5]);
        System.out.println(bools[9]);

    }
}
