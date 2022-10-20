package Assignment;

import java.util.Scanner;
import java.io.*;

public class manageFrame {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\meoca\\Desktop\\frame.txt";
        Scanner pc = new Scanner(System.in);
        menu menu = new menu();

        menu.add("1 - Add a frame.");
        menu.add("2 - Search a frame.");
        menu.add("3 - Update the price of a frame (based on it's ID).");
        menu.add("4 - Remove a frame (based on it's ID).");
        menu.add("5 - Print the list.");
        menu.add("6 - Save the list to file.");
        menu.add("7 - Quit.");

        int userChoice;
        boolean changed = false;
        main list = new main();
        list.addFromFile(fileName);

        do {
            System.out.println("\n--- Frame ---");
            userChoice = menu.getUserChoice();
            switch (userChoice) {
                case 1:
                    list.addNewFra();
                    changed = true;
                    break;
                case 2:
                    list.searchFra();
                    changed = true;
                    break;
                case 3:
                    list.updateFra();
                    changed = true;
                    break;
                case 4:
                    list.removeFra();
                    changed = true;
                    break;
                case 5:
                    list.print();
                    changed = true;
                    break;
                case 6:
                    list.saveToFile(fileName);
                    changed = true;
                    break;
                default:
                    if (changed) {
                        System.out.print("Save changes Y/N: ");
                        String response = pc.nextLine().toUpperCase();
                        if (response.startsWith("Y")) {
                            list.saveToFile(fileName);
                        }
                    }
            }
        } while (userChoice > 0 && userChoice < 7);
    }
}
