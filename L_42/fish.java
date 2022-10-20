package L_42;

public class fish extends animal {
    public fish() {
        super("Fish");
    }

    @Override
    public void eat() {
        System.out.println("I eat plants");
    }

    @Override
    public void makeSound() {
        System.out.println("ngoap ngoap");
    }
}
