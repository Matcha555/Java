package Lab6;

import java.util.Iterator;
import java.util.Vector;
import java.util.Scanner;

public class menu extends Vector<String> {

    public menu() {
        super();
    }

    void addMenuItem(String S) {
        this.add(S);
    }

    int getUserChoice() {
        Iterator iter = this.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        return choice;
    }
}
