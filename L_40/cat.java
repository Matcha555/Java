package L_40;

public class cat extends animal {

    public cat() // hoặc cat(String n)
    {
        super("Cat"); // truyền từ khóa 'Cat' qua hàm constructor của lớp animal
    }

    public void sound() {
        System.out.println("meow");
    }

}
