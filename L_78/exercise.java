package L_78;

import javax.swing.JFrame;

public class exercise extends JFrame {

    public exercise() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void exe1() {
        this.setVisible(true);
    }

    public void exe1(String title) {
        this.setTitle(title);
        this.setVisible(true);
    }

    public void exe2(String title, int width, int height, int location1, int location2) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocation(location1, location2);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        exercise e1 = new exercise();
        e1.exe1();

        exercise e2 = new exercise();
        e2.exe1("Drink");

        exercise e3 = new exercise();
        e3.exe2("Book", 215, 69, 51, 88);
    }
}
