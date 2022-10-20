package L_51;

public class check {
    public static void main(String[] args) {
        String s1 = "Hello, I'm Quang, it's an orange. Hello, it's an apple";
        String s2 = "I'm";
        String s3 = "This is my car.";
        String s4 = "Hello";
        char c = 'o';

        // indexOf(): returns the position of the first occurrence of specified
        // character(s) in a string.
        System.out.println("Position 1: " + s1.indexOf(s2)); // position: 7
        System.out.println("Position 2: " + s1.indexOf(s3)); // false, cuz no values appear in s1.

        // indeOf(s4, dat_vi_tri_bat_dau_tim_kiem)
        System.out.println("Postion 3: " + s1.indexOf(s4, 2)); // indexOf(s4, bat_dau_tu_vi_tri_thu_1 trong chuoi s1)
        System.out.println("Position of c is: " + s1.indexOf(c));

        // lastIndexOf(): tim kiem tu phai sang trai (cung giong nhu ham indexOf)
        System.out.println("Postion 4: " + s1.lastIndexOf(s4, 33));
    }
}
