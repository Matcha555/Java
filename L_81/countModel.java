//https://www.youtube.com/watch?v=xQanNCANbSk&t=1s
package L_81;

public class countModel {
    private int value;

    public countModel() {
        this.value = 0; // Khi khởi động chương trình lên, biến value = 0.
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increase() {
        this.value++; // Tăng giá trị lên 1 đơn vị.
    }

    public void decrease() {
        this.value--; // Giảm giá trị đi 1 đơn vị.
    }

    public void reset() {
        this.value = 0; // đưa giá trị value về bằng 0.
    }
}
