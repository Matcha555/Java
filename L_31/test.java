package L_31;

public class test {
    public static void main(String[] args) {
        CoffeeBill pc = new CoffeeBill("Trung Nguyen", 124500, 5.5);
        System.out.println("Total: " + pc.total());
        System.out.println("Check weight: " + pc.testHigherWeight(6));
        System.out.println("Check price: " + pc.testTotal());
        System.out.println("Sale: " + pc.sale(20));
        System.out.println("You have to pay: " + pc.giaSauKhiGiam(20));
    }
}
