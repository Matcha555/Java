package L_79;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class border extends JFrame {

    public border() {
        this.setTitle("Country");
        this.setSize(350, 350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout bla1 = new BorderLayout();
        BorderLayout bla2 = new BorderLayout(5, 5);
        // this.setLayout(bla1);
        this.setLayout(bla2);

        JButton jb1 = new JButton();
        JButton jb2 = new JButton();
        JButton jb3 = new JButton();
        JButton jb4 = new JButton();
        JButton jb5 = new JButton();

        // Set background for each button.
        jb1.setBackground(Color.magenta);
        jb2.setBackground(Color.pink);
        jb3.setBackground(Color.blue);
        jb4.setBackground(Color.gray);
        jb5.setBackground(Color.yellow);

        // set preferred size for each button. Dimension contains the height and width
        // of a component in an integer as well as double precision.
        jb1.setPreferredSize(new Dimension(100, 100));
        jb2.setPreferredSize(new Dimension(100, 100));
        jb3.setPreferredSize(new Dimension(100, 100));
        jb4.setPreferredSize(new Dimension(100, 100));
        jb5.setPreferredSize(new Dimension(100, 100));

        this.add(jb1, BorderLayout.NORTH);
        this.add(jb2, BorderLayout.EAST);
        this.add(jb3, BorderLayout.SOUTH);
        this.add(jb4, BorderLayout.WEST);
        this.add(jb5, BorderLayout.CENTER);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new border();
    }
}
