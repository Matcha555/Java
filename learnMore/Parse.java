package learnMore;

import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = Integer.parseInt(pc.nextLine());

        System.out.print("Name: ");
        String name = pc.nextLine();

        System.out.print("Mark: ");
        double mark = Double.parseDouble(pc.nextLine());

        System.out.println(age + ", " + name + ", " + mark);
    }
}
