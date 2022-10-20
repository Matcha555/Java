package L_79;

//The GridLayout manages the components in the form of a rectangular grid.
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class grid extends JFrame {

    public grid() {
        this.setTitle("Games");
        this.setSize(250, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        GridLayout gla1 = new GridLayout();
        GridLayout gla2 = new GridLayout(3, 3); // GridLayout(row, column)
        GridLayout gla3 = new GridLayout(3, 3, 10, 10); // GridLayout(row, column, pixel, pixel)
        // this.setLayout(gla1);
        // this.setLayout(gla2);
        this.setLayout(gla3);

        // Button
        // JButton jbu1 = new JButton("1");
        // JButton jbu2 = new JButton("2");
        // JButton jbu3 = new JButton("3");
        for (int i = 0; i < 12; i++) {
            JButton Jb = new JButton(i + ""); // Vì JButton định dạng text, cho nên cộng thêm ""(dấu cách).
            this.add(Jb); // Add component.
        }

        // Add components
        // this.add(jbu1);
        // this.add(jbu2);
        // this.add(jbu3);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new grid();
    }
}
