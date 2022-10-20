package L_67;

import java.io.File;
import java.io.IOException;

public class newFile {
    public static void main(String[] args) {
        // .exists(): Kiem tra thu muc hoac tap tin co ton tai khong.
        File fi = new File("C:\\Users\\meoca\\Desktop\\mic1");
        System.out.println("Is fi file exist? " + fi.exists()); // False, vì tập tin chưa được tạo.

        // Create only one folder: mkdir()
        File fol1 = new File("C:\\Users\\meoca\\Desktop\\mouse");
        fol1.mkdir();

        // Create many folders: mkdirs()
        File fol2 = new File("C:\\Users\\meoca\\Desktop\\mouse\\mic1\\mic2\\mic3");
        fol2.mkdirs();

        // Create a new file
        File file1 = new File("C:\\Users\\meoca\\Desktop\\house\\luxuryHouse.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            // Không có quyền tạo tập tin
            // Ổ cứng đầy
            // Đường dẫn sai
            // ...
            e.printStackTrace();
        }

    }
}
