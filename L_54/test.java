package L_54;

public class test {
    public static void main(String[] args) {
        student st1 = new student(412, "Pham Son", "OSG202", 9.1);
        student st2 = new student(723, "Le Tu Ong", "smk999", 5.16);

        System.out.println(st1.compareTo(st2)); // st1 < st2

        student st3 = new student(824, "Doan Trieu Dieu Anh", "uaj281", 7.2);
        System.out.println(st3.compareTo(st1)); // st3 < st1

    }
}
