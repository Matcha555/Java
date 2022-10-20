//ActionListener is a class that is responsible for handling all action events such as when the user clicks on a component. Mostly, action listeners are used for JButtons.
package L_81;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class countListener implements ActionListener {
    private countView ctv;

    public countListener(countView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Hiển thị người dùng ấn nút gì.
        String src = e.getActionCommand(); // e: là sự kiện người ta muốn nhấn nút. ; getActionCommand(): lấy tên của
                                           // nút ra.
        System.out.println("You pressed the button: " + src); // Nếu nhấn nút UP -> You pressed: UP; nhấn nút down ->
                                                              // You pressed: down.

        if (src.equals("UP")) {
            this.ctv.increment();
        } else if (src.equals("DOWN")) {
            this.ctv.decrement();
        } else {
            this.ctv.resetValue();
        }
    }

}
