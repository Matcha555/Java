package L_43;

public class math {
    public int min(int a, int b) {
        if (a < b)
            return a;

        else
            return b;
    }

    // cũng giống ở trên nhưng khác tham số.
    public double min(double a, double b) {
        if (a < b)
            return a;
        else
            return b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(double[] arr) {
        double s = 0;
        for (int i = 0; i < arr.length; i++) // arr.length: độ dài của mảng arr.
        {
            s += arr[i];
        }
        return s;
    }
}
