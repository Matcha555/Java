package Loops;

public class continueBreak {
    // public static void main(String[] args) {
    // int out, in = 0;
    // outer: for (out = 0; out < 10; out++) {
    // for (in = 0; in < 20; in++) {
    // if (in > 10)
    // break outer;
    // }
    // System.out.println("Inside the outer loop: out = " + out + ", in = " + in);
    // }
    // System.out.println("End of the outer loop: out = " + out + ", in = " + in);
    // }

    // Continue: sẽ bỏ qua những gì bên dưới nó.
    public static void main(String[] args) {
        int max = 100;
        for (int i = 0; i < max; i++) // 0<=i<100
        {
            if (i < 50)
                continue; /*
                           * Câu lệnh trên (i<50) thì câu lệnh System.out.println(i) ở dưới
                           * sẽ không được thực thi.
                           * Tiếp tục quay trở lại vòng lặp để in (100>i>50).
                           */
            System.out.println(i);
        }
    }
}
