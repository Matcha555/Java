package Lab6;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.Scanner;
import java.util.Collection;

public class empList extends Vector<employee> {

    Scanner sc = new Scanner(System.in);

    public empList() {
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
                String name = stk.nextToken().toUpperCase();
                String address = stk.nextToken().toUpperCase();
                double salaary = Double.parseDouble(stk.nextToken());
                double allowance = Double.parseDouble(stk.nextToken());

                employee emp = new employee(ID, name, address, salaary, allowance);
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
            for (employee x : this) {
                pw.println(x.getID() + " ; " + x.getName() + " ; " + x.getAddress() + " ; " + x.getSalary() + " ; "
                        + x.getAllowance());
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

    public void addNewEmp() {
        String ID, name, add;
        double sala, alwa;
        boolean valid;
        int pos;
        System.out.println("+ New employee: ");
        do {
            System.out.print("ID E000: ");
            ID = sc.nextLine().toUpperCase();
            pos = find(ID);
            valid = ID.matches("^E[0-9]{3}");
            if (pos >= 0) {
                System.out.println("The ID is duplicated.");
            }
            if (!valid) {
                System.out.println("The ID must have E and 3 digits.");
            }
        } while (pos >= 0 || (!valid));
        System.out.print("Name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Address: ");
        add = sc.nextLine().toUpperCase();
        System.out.print("Salary: ");
        sala = Double.parseDouble(sc.nextLine());
        System.out.print("Allowance: ");
        alwa = Double.parseDouble(sc.nextLine());
        employee emp = new employee(ID, name, add, sala, alwa);
        this.add(emp);
    }

    public void searchEmp() {
        String code;
        boolean valid = true;
        do {
            System.out.print("You want to search ID: ");
            code = sc.nextLine().toUpperCase();
            valid = code.matches("^E[0-9]{3}");
            if (!valid) {
                System.out.println("The ID must have E and 3 digits");
            }
        } while (!valid);
        int pos = find(code);
        if (pos < 0) {
            System.out.println("This ID not exist!");
        } else {
            this.get(pos).print();
        }
    }

    public void removeEmp() {
        System.out.print("You want to remove ID: ");
        boolean valid;
        String ID;
        do {
            ID = sc.nextLine().toUpperCase();
            valid = ID.matches("^E\\d{3}");
            if (!valid) {
                System.out.println("The ID must have E and 3 digits!");
            }
        } while (!valid);

        int pos = find(ID);
        if (pos < 0) {
            System.out.println("This ID not exist!");
        } else {
            this.remove(pos);
            System.out.println("The employee " + ID + " has been removed.");
        }
    }

    public void update() {
        System.out.print("You want to update ID: ");
        boolean valid;
        String ID;
        do {
            ID = sc.nextLine().toUpperCase();
            valid = ID.matches("^E[0-9]{3}");
            if (!valid) {
                System.out.println("The ID must have E and 3 digits!");
            }
        } while (!valid);

        int pos = find(ID);
        if (pos < 0) {
            System.out.println("This ID not exist!");
        } else {
            System.out.print("Name: ");
            String newname = sc.nextLine();
            System.out.print("Address: ");
            String newadd = sc.nextLine();
            System.out.print("Salary: ");
            double newsala = Double.parseDouble(sc.nextLine());
            System.out.print("Allowance: ");
            double newalwa = Double.parseDouble(sc.nextLine());
            this.get(pos).update(newname, newadd, newsala, newalwa);
        }
    }

    public void print() {
        for (int i = 0; i < this.size(); i++) {
            this.get(i).print();
        }
    }

    public void printIcomeInArange() {
        System.out.print("Enter r1 = ");
        int r1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter r2 = ");
        int r2 = Integer.parseInt(sc.nextLine());
        if (r1 > r2) {
            int tmp = r1;
            r1 = r2;
            r2 = tmp;
        }
        double S = 0;
        for (int i = 0; i < this.size(); i++) {
            S = this.get(i).getAllowance() + this.get(i).getSalary();
            if (S >= r1 && S <= r2) {
                this.get(i).print();
            }
        }
    }

}