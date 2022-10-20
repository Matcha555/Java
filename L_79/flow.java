//https://www.youtube.com/watch?v=1x2SRoW835s&t=10s
package L_79;

//The FlowLayout is the default layout. It layout the components in a directional flow.
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class flow extends JFrame {

    public flow() {
        this.setTitle("Food");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null); // Program in the middle of the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        FlowLayout f1 = new FlowLayout();
        FlowLayout f2 = new FlowLayout(FlowLayout.LEFT); // Display layout on the left side.
        FlowLayout f3 = new FlowLayout(FlowLayout.CENTER, 20, 100); // 20: Khoảng cách giữa các nút; 100: khoảng cách từ
                                                                    // trên xuống các nút
        // this.setLayout(f1); //Display layout.
        // this.setLayout(f2);
        this.setLayout(f3);

        // Button
        JButton jb1 = new JButton("A");
        JButton jb2 = new JButton("B");
        JButton jb3 = new JButton("C");

        // Add components
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new flow();
    }
}
