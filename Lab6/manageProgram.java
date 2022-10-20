package Lab6;

import java.util.Scanner;
import java.io.*;

public class manageProgram {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\meoca\\Desktop\\employee.txt";
        Scanner sc = new Scanner(System.in);
        menu menu = new menu();

        menu.add("1. Add an employee");
        menu.add("2. Search employee details using his/her code");
        menu.add("3. Remove an employee  using his/her code");
        menu.add("4. Update information of an employee using his/her code");
        menu.add("5. Print out all the list");
        menu.add("6. Print out employees whose incomes are in the range r1, r2");
        menu.add("7. Save the list to file employees.txt using the above format.");

        int userChoice;
        boolean changed = false;
        empList list = new empList();
        list.addFromFile(fileName);

        do {
            System.out.println("\n--- EMPLOYEE MANAGE ---");
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    list.addNewEmp();
                    changed = true;
                    break;
                case 2:
                    list.searchEmp();
                    changed = true;
                    break;
                case 3:
                    list.removeEmp();
                    changed = true;
                    break;
                case 4:
                    list.update();
                    changed = true;
                    break;
                case 5:
                    list.print();
                    changed = true;
                    break;
                case 6:
                    list.printIcomeInArange();
                    changed = true;
                    break;
                case 7:
                    list.saveToFile(fileName);
                    changed = true;
                    break;
                default:
                    if (changed) // nhắc nhở người dùng lưu chương trình.
                    {
                        System.out.print("Save changes Y/N: ");
                        String response = sc.nextLine().toUpperCase();
                        if (response.startsWith("Y")) {
                            list.saveToFile(fileName);
                        }
                    }
            }
        } while (userChoice > 0 && userChoice < 8);
    }
}
