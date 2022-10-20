package Lab6;

public class employee {

    private String ID;
    private String name;
    private String address;
    private double salary;
    private double allowance;

    public employee(String ID, String name, String address, double salary, double allowance) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.allowance = allowance;
    }

    public void update(String name, String address, double salary, double allowance) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.allowance = allowance;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void print() {
        System.out.println("Employee{" + "ID: " + ID + ", name: " + name + ", address: " + address + ", salary="
                + salary + ", allowance: " + allowance + '}');
    }
}
