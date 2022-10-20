package L_37;

public class Test {
    public static void main(String[] args) {

        Date da1 = new Date(12, 2, 2001);
        Date da2 = new Date(4, 5, 1999);
        Date da3 = new Date(12, 2, 2001);

        Class cl1 = new Class("HS10", "Computer and Information Sciences");
        Class cl2 = new Class("EC9", "Social Sciences");
        Class cl3 = new Class("T91Y", "Natural Sciences");

        Student stu1 = new Student("SE1552", "John Clark", da2, 6.5, cl3);
        Student stu2 = new Student("SA7682", "Pham Minh Quang", da3, 5.0, cl1);
        Student stu3 = new Student("IA9827", "Micheal Black", da1, 3.5, cl2);

        System.out.println("Major 3: " + stu1.printMajor());
        System.out.println("Major 2: " + stu3.printMajor());
        System.out.println("Major 1: " + stu2.printMajor() + "\n-----");

        System.out.println("Check average stu1: " + stu1.checkAverage(5));
        System.out.println("Check average stu3: " + stu3.checkAverage(5));
        System.out.println("Check average stu2: " + stu2.checkAverage(5) + "\n-----");

        System.out.println("Check date stu1 and stu2: " + stu1.checkDate(stu2));
        System.out.println("Check date stu2 and stu3: " + stu2.checkDate(stu3));
        System.out.println("Check date stu3 and stu1: " + stu3.checkDate(stu1));

    }
}