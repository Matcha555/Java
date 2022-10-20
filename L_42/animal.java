package L_42;

public class animal {
    protected String name;

    public animal(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void sleep() {
        System.out.println("zzzzzz");
    }

    public void makeSound() {
        System.out.println(".................");
    }

    public void eat() {
        System.out.println("Goc goc");
    }
}
