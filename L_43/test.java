package L_43;

public class test {
    public static void main(String[] args) {
        // tao ra mot doi tuong
        math m = new math();
        System.out.println(m.min(4, 4));
        System.out.println(m.min(7, 7.2));

        System.out.println(m.sum(1, 9));

        double arr[] = new double[] { 1, 2, 3, 4, 5 };
        System.out.println(m.sum(arr));
    }
}
