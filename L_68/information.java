package L_68;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class information {

    File file;

    // Hàm constructor
    public information(String fn) // nhận vào một chuỗi fn.
    {
        // tạo ra tập tin mới dựa trên chuỗi(fn) điền vào.
        this.file = new File(fn);
    }

    // canExecute(): Check if the file is executable.
    public boolean ExecutionCheck() {
        return this.file.canExecute();
    }

    // canRead(): Check if the file is readable.
    public boolean readingCheck() {
        return this.file.canRead();
    }

    // canWrite(): Check if the file is writable.
    public boolean writingCheck() {
        return this.file.canWrite();
    }

    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int option = 0;
        System.out.print("Enter file name: ");
        String fn = pc.nextLine();
        information infor = new information(fn);

        do {
            System.out.println("----Menu----");
            System.out.println("1 - Kiem tra file co the thuc thi: ");
            System.out.println("2 - Kiem tra file co the doc: ");
            System.out.println("3 - Kiem tra file co the ghi: ");
            System.out.println("4 - Path: ");
            System.out.println("5 - File name: ");
            System.out.println("6 - Check that is a folder or file: ");
            System.out.println("7 - In danh sach file con: ");
            System.out.println("8 - In ra cay thu muc: ");

            System.out.print("Enter your option: ");
            option = pc.nextInt();

            switch (option) {
                case 1:
                    System.out.println(infor.ExecutionCheck());
                    break;
                case 2:
                    System.out.println(infor.readingCheck());
                    break;
                case 3:
                    System.out.println(infor.writingCheck());
                default:
                    break;
            }
        } while (option != 0);
    }
}
