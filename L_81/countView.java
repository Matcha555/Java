package L_81;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.ActionListener;
import L_81.countModel;

public class countView extends JFrame {

    private countModel com;
    private JButton jb_up;
    private JButton jb_down;
    private JButton jb_reset;
    private JLabel jbl; // Display the value

    public countView() {
        this.com = new countModel();
        this.init(); // hàm khởi tạo
        this.setVisible(true);
    }

    // hàm khởi tạo
    public void init() {
        this.setTitle("Program");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Muốn gán sự kiện có những đối tượng nào thì phải tạo ra Listener
        ActionListener ac = new countListener(this); // this: là countView hiện tại đang làm việc.(dòng 15)

        jb_up = new JButton("UP"); // truyền vào nút jb_up chữ UP
        jb_up.addActionListener(ac); // Khi ai đó nhấn vào nút jb_up(UP) thì đi đến một controller nào đó để quản lý
                                     // của nút jb_up(UP).
        jb_down = new JButton("DOWN"); // truyền vào nút jb_down chữ DOWN
        jb_down.addActionListener(ac); // Khi ai đó nhấn vào nút jb_down(down) thì đi đến một controller nào đó để quản
                                       // lý của nút jb_down(down).
        jb_reset = new JButton("Reset");
        jb_reset.addActionListener(ac);

        /*
         * lấy dữ liệu của cm; do JLabel chỉ nhận text(đoạn văn),
         * mà trong khi getValue() là int, cho nên + ""(dấu cách)
         */
        jbl = new JLabel(this.com.getValue() + "", JLabel.CENTER); // JLabel.CENTER: căn chữ ra giữa

        JPanel jpa = new JPanel();
        jpa.setLayout(new BorderLayout());
        jpa.add(jb_up, BorderLayout.WEST);
        jpa.add(jb_down, BorderLayout.EAST);
        jpa.add(jb_reset, BorderLayout.SOUTH);
        jpa.add(jbl, BorderLayout.CENTER);

        // set preferred size for each button. Dimension contains the height and width
        // of a component in an integer as well as double precision.
        jb_up.setPreferredSize(new Dimension(100, 100));
        jb_down.setPreferredSize(new Dimension(100, 100));
        jb_reset.setPreferredSize(new Dimension(100, 100));

        // Khi add xong một phần của jpanel, rồi add jpanel này vào màn hình chính.
        this.setLayout(new BorderLayout());
        this.add(jpa, BorderLayout.CENTER);
    }

    /*
     * Muốn tăng hay giảm giá trị thì phải thông qua countModel, bởi vì countModel
     * lưu giữ giá trị hiện tại.
     */

    // Hàm tăng giá trị
    public void increment() {
        this.com.increase(); // VD: trong cm đang chứa giá trị là 5, sau đó gọi hàm increase() thì lúc này
                             // giá trị tăng lên 1 đơn vị là 6
        this.jbl.setText(this.com.getValue() + ""); // this.cm.getValue(): lấy ngược value từ trong cm(countModel).
    }

    // Hàm giảm giá trị
    public void decrement() {
        this.com.decrease();
        this.jbl.setText(this.com.getValue() + "");
    }

    // Hàm reset giá trị
    public void resetValue() {
        this.com.reset();
        this.jbl.setText(this.com.getValue() + "");
    }
}
