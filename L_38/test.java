package L_38;

public class test {
    public static void main(String[] args) {

        date da1 = new date(12, 2, 1996);
        date da2 = new date(4, 6, 1967);
        date da3 = new date(5, 12, 1981);

        country con1 = new country("Viet Nam", "VN");
        country con2 = new country("Switzerland", "CH");
        country con3 = new country("Canada", "CA");

        manufacturer man1 = new manufacturer("Dell", con2);
        manufacturer man2 = new manufacturer("HP", con3);
        manufacturer man3 = new manufacturer("Razer", con1);

        computer co1 = new computer(man3, da2, 120, 24);
        computer co2 = new computer(man1, da3, 560, 36);
        computer co3 = new computer(man2, da1, 310, 28);

        System.out.println("Check price co1 and co2: " + co1.checkPrice(co2));
        System.out.println("Check price co2 and co3: " + co2.checkPrice(co3));
        System.out.println("Check price co3 and co1: " + co3.checkPrice(co1));

        System.out.println("------");

        System.out.println("Manufacturer co1: " + co1.printCountryName());
        System.out.println("Manufacturer co2: " + co2.printCountryName());
        System.out.println("Manufacturer co3: " + co3.printCountryName());

    }
}