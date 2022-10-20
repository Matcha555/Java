package Assignment;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class menu extends Vector<String> {
    public menu() {
        super();
    }

    void addMenu(String s) {
        this.add(s);
    }

    int getUserChoice() {
        Iterator iter = this.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Scanner pc = new Scanner(System.in);
        System.out.print("- Enter your choice: ");
        int choice = pc.nextInt();
        return choice;
    }

}
