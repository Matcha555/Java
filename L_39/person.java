package L_39;

public class person {
    private String name;
    private int age;
    private float weight;

    public person(String n, int a, float w) {
        this.name = n;
        this.age = a;
        this.weight = w;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float w) {
        this.weight = w;
    }

    public void eat() {
        System.out.println("rop rop");
    }

    public void move() {
        System.out.println("cuc cuc");
    }

    public void sleep() {
        System.out.println("z z z");
    }
}
