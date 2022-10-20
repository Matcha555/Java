package L_40;

public class animal {

    // protected: phạm vi truy cập trong một package. VD: protected này chỉ gọi được
    // trong package L_40
    protected String name;

    public animal(String n) // ở lớp cat, tên của n sẽ là 'Cat'.
    {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void play() {
        System.out.println("I'm playing soccer.");
    }
}
