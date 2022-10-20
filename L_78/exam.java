package L_78;

import javax.swing.JFrame;

public class exam {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        // Name of title
        jf.setTitle("Mickey");

        // Size of the program frame
        jf.setSize(200, 400);

        // Location of the program
        jf.setLocation(150, 123);

        /*
         * Exit the program when the program frame is closed. Khi đóng chương trình bên
         * ngoài, thì chương trình bên trong cũng đóng theo.
         */
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setVisible(true);
        /*
         * setVisible(true): it shows program frame in the top left corner.
         * setVisible(false): it doesn't display anthing
         */
    }
}
