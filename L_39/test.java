package L_39;

public class test {
    public static void main(String[] args) {

        person p = new person("Pham Minh Quang", 20, 60);
        p.eat();
        p.move();
        p.sleep();

        System.out.println("-----");
        student s = new student("Doan Trieu Dieu Anh", 21, 52, 1239, "HL76");
        s.eat();
        s.move();
        s.sleep();
        s.homeWork();
    }
}