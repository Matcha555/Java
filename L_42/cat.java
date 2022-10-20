package L_42;

public class cat extends animal {
    public cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("I eat food.");
    }

    @Override
    public void makeSound() {
        System.out.println("meoz meoz");
    }
}
