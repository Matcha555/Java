package Assignment;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Scanner;
import java.util.Collection;

public class main extends Vector<frame> {

    Scanner pc = new Scanner(System.in);

    public main() {
        super();
    }

    public void addFromFile(String fname) {
        try {
            File f = new File(fname);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;

            while ((details = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(details, ";");
                String ID = stk.nextToken().toUpperCase();
                String make = stk.nextToken().toUpperCase();
                double length = Double.parseDouble(stk.nextToken());
                double width = Double.parseDouble(stk.nextToken());
                double price = Double.parseDouble(stk.nextToken());

                frame emp = new frame(ID, make, length, width, price);
                this.add(emp);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFile(String fName) {
        if (this.size() == 0) {
            System.out.println("Empty List!");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (frame x : this) {
                pw.println(x.getID() + " ; " + x.getMake() + " ; " + x.getLength() + " ; " + x.getWidth() + " ; "
                        + x.getPrice());
            }
            fw.close();
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int find(String ID) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }

    public void addNewFra() {
        String ID, mak;
        double len, wid, pri;
        boolean valid;
        int pos;
        System.out.println("+ New frame: ");
        do {
            System.out.print("ID E0000: ");
            ID = pc.nextLine().toUpperCase();
            pos = find(ID);
            valid = ID.matches("^E[0-9]{4}");
            if (pos >= 0) {
                System.out.println("The ID is duplicated.");
            }
            if (!valid) {
                System.out.println("The ID must have E and 4 digits.");
            }
        } while (pos >= 0 || (!valid));
        System.out.print("Make: ");
        mak = pc.nextLine().toUpperCase();
        System.out.print("Length: ");
        len = Double.parseDouble(pc.nextLine());
        System.out.print("Width: ");
        wid = Double.parseDouble(pc.nextLine());
        System.out.print("Price: ");
        pri = Double.parseDouble(pc.nextLine());
        frame emp = new frame(ID, mak, len, wid, pri);
        this.add(emp);
    }

    public void print() {
        for (int i = 0; i < this.size(); i++) {
            this.get(i).print();
        }
    }

    public void searchFra() {
        double leng, widt; // Biến để nhập vào.
        System.out.print("Enter length: ");
        leng = Double.parseDouble(pc.nextLine());
        System.out.print("Enter width: ");
        widt = Double.parseDouble(pc.nextLine());

        double l1, w1;
        for (int i = 0; i < this.size(); i++) {
            l1 = this.get(i).getLength(); // Biến ban đầu.
            w1 = this.get(i).getWidth(); // Biến ban đầu.
            if (l1 > leng && w1 > widt) // Nếu biến ban đầu > biến nhập vào.
                this.get(i).print(); // thì in ra màn hình.
        }
    }

    public void removeFra() {
        System.out.print("You want to remove ID: ");
        boolean valid;
        String ID;
        do {
            ID = pc.nextLine().toUpperCase();
            valid = ID.matches("^E\\d{4}");
            if (!valid) {
                System.out.println("The ID must have E and 4 digits!");
            }
        } while (!valid);

        int pos = find(ID);
        if (pos < 0) {
            System.out.println("This ID isn't exist!");
        } else {
            this.remove(pos);
            System.out.println("The frame " + ID + " has been removed.");
        }
    }

    public void updateFra() {
        System.out.print("You want to update ID: ");
        boolean valid;
        String ID;
        do {
            ID = pc.nextLine().toUpperCase();
            valid = ID.matches("^E[0-9]{4}");
            if (!valid) {
                System.out.println("The ID must have E and 4 digits!");
            }
        } while (!valid);

        int pos = find(ID);
        if (pos < 0) {
            System.out.println("This ID isn't exist!");
        } else {
            System.out.print("Make: ");
            String ma = pc.nextLine();
            System.out.print("Length: ");
            double le = Double.parseDouble(pc.nextLine());
            System.out.print("Width: ");
            double wi = Double.parseDouble(pc.nextLine());
            System.out.print("Price: ");
            double pric = Double.parseDouble(pc.nextLine());
            this.get(pos).update(ma, le, wi, pric);
        }
    }

}
