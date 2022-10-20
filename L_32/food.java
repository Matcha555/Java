package L_32;

public class food {
    public String candy;
    public String cake;

    public food() {
        this.candy = candy;
        this.cake = cake;
    }

    public String getCandy() {
        return candy;
    }

    public void setCandy(String candy) {
        this.candy = candy;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    @Override
    public String toString() {
        return cake + ", " + candy;
    }

    public void cartoon(int age) // Điền vào giá trị tham số.
    {
        System.out.println("I'm Mickey, I'm " + age);
    }

}
