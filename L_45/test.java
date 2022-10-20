package L_45;

public class test {
    public static void main(String[] args) {

        manufacturer man1 = new manufacturer("Bentley", "England");
        manufacturer man2 = new manufacturer("Toyota", "Japan");
        manufacturer man3 = new manufacturer("Ford", "America");

        plane v1 = new plane(man3, "Petrol");
        vehicle v2 = new car(man1, "Electric");
        vehicle v3 = new bicycle(man2);

        System.out.println("Manufactuter: ");
        System.out.println("v1: " + v1.manufacturerName());

        System.out.println("Start: ");
        v2.start();

        System.out.println("Speed: ");
        System.out.println("v1: " + v1.speed());
        System.out.println("v2: " + v2.speed());
        System.out.println("v3: " + v3.speed());

        System.out.println("Fly: ");
        v1.fly();
    }
}
