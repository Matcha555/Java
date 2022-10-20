package L_42;

public class dog extends animal {

    public dog() {
        super("Dog");
    }

    @Override // override: phương thức này tồn tại ở lớp cha(animal).
    public void eat() {
        System.out.println("I eat bone.");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}