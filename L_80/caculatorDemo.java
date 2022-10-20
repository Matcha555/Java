package L_80;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class caculatorDemo extends JFrame {

    public caculatorDemo() {
        this.setTitle("Demo");
        this.setSize(234, 320);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextField is a lightweight component that allows the editing of a single
        // line of text.
        JTextField jtf = new JTextField();
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout()); // Create a new borderLayout and display jp.
        jp.add(jtf, BorderLayout.CENTER); // add jtf and BorderLayout in the jp.

        JButton jb = new JButton("0");
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jb_add = new JButton("+");
        JButton jb_sub = new JButton("-");
        JButton jb_mul = new JButton("*");
        JButton jb_div = new JButton("/");
        JButton jb_equ = new JButton("=");

        // Create a JPanel containing the buttons above.
        JPanel jb_button = new JPanel();
        jb_button.setLayout(new GridLayout(5, 3)); // Create a new gridLayout and display jp_button

        jb_button.add(jb);
        jb_button.add(jb1);
        jb_button.add(jb2);
        jb_button.add(jb3);
        jb_button.add(jb4);
        jb_button.add(jb5);
        jb_button.add(jb6);
        jb_button.add(jb7);
        jb_button.add(jb8);
        jb_button.add(jb9);
        jb_button.add(jb_add);
        jb_button.add(jb_sub);
        jb_button.add(jb_mul);
        jb_button.add(jb_div);
        jb_button.add(jb_equ);

        // Sau khi tạo xong JTextField và JButton, điền chúng theo thứ tự tùy muốn:
        // NORTH, EAST, WEST, SOUTH,CENTER
        this.setLayout(new BorderLayout());
        this.add(jp, BorderLayout.NORTH); // add jp to BorderLayout.NORTH
        this.add(jb_button, BorderLayout.CENTER); // add jp_button to BorderLayout.CENTER.

        this.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            // Change Look and feel; UIManager: User Iterface manager
            /*
             * getSystemLookAndFeelClassName(): Lấy giao diện của hệ thống ra(giao diện hệ
             * điều hành Windows).
             */
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            new caculatorDemo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
