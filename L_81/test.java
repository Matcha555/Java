package L_81;

import L_81.countModel;

public class test {
    public static void main(String[] args) {
        countModel cm = new countModel();
        // do value ban đầu bằng 0
        cm.increase(); // +1 đơn vị (1)
        cm.increase(); // +1 đơn vị (1)

        System.out.println("Increase: " + cm.getValue()); // (1)1 + (2)1 = 2

        cm.decrease(); // -1 đơn vị
        System.out.println("Decrease: " + cm.getValue());

        countView cv = new countView();
    }
}
