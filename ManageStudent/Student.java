//https://www.youtube.com/watch?v=Jvt5n8WKwd4&list=LL&index=4&t=873s   16:36
package ManageStudent;

import java.util.Scanner;

public class Student {
    // Bây giờ mình muốn id tự tăng -> giải pháp là gì?
    static int count = 0; /*
                           * Vì static là biến tĩnh, mà biến tĩnh gắn với class object(Student), nó là một
                           * ô nhớ dùng chung. Tức là nó đã tạo ra rồi(ô nhớ là ô nhớ dùng chung), lần sau
                           * tạo ra một đối tượng mới thì nó vẫn trỏ tiếp cái đối tượng trước đó(vì là ô
                           * nhớ dùng chung)
                           */

    int id, age;
    String name, address;
    float gpa;

    public Student() {
    }

    public Student(int id, int age, String name, String address, float gpa) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void display() {
        System.out.println(this);
    }

    // Enter elements
    public void input() {
        Scanner pc = new Scanner(System.in);

        // System.out.print("Enter ID: ");
        // id = Integer.parseInt(pc.nextLine());
        id = ++count;

        System.out.print("Enter name: ");
        name = pc.nextLine();

        System.out.print("Enter address: ");
        address = pc.nextLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(pc.nextLine());

        System.out.print("Enter gpa: ");
        gpa = Float.parseFloat(pc.nextLine());
    }

    @Override
    public String toString() {
        return "Student: " + id + ", " + age + ", " + name + ", " + address + ", " + gpa;
    }
}
