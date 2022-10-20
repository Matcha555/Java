package L_46;

public class test {
    public static void main(String[] args) {
        System.out.println("a) ");

        casio580 ca = new casio580();
        vinacal500 vi = new vinacal500();

        System.out.println("6 + 4 = " + ca.plus(6, 4));
        System.out.println("10 * 9 = " + vi.times(10, 9));
        System.out.println("6 / 0 = " + ca.divideBy(6, 0));

        System.out.println("b) ");
        double[] arr = new double[] { 5, 12, 7, 89, 10, -2 };
        double[] arr2 = new double[] { 8, -6, -21, 87, 45, -28 };
        insertionSort ins = new insertionSort();
        selectionSort sel = new selectionSort();

        ins.sortAscending(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        sel.sortDescending(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
    }
}
