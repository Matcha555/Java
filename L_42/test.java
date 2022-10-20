package L_42;

public class test {
    public static void main(String[] args) {
        System.out.println("- Dog: ");
        dog d = new dog();
        d.eat();
        d.makeSound();
        d.sleep();

        System.out.println("- Cat: ");
        cat c = new cat();
        c.eat();
        c.makeSound();
        c.sleep();

        System.out.println("- Fish: ");
        fish f = new fish();
        f.eat();
        f.makeSound();
        f.sleep();
    }
}
