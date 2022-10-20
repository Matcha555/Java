package L_44;

public class test {
    public static void main(String[] args) {
        toaDo td1 = new toaDo(4, 7);
        toaDo td2 = new toaDo(5, 5);
        toaDo td3 = new toaDo(8, 3);

        // hinh hi = new hinh(td1); -> abstract khong the tao ra doi tuong. -> loi chay
        // chuong trinh.
        hinh h1 = new diem(td1);
        hinh h2 = new hinhTron(td2, 6);
        hinh h3 = new hinhChuNhat(td3, 7, 12);

        System.out.println("Acreage h1: " + h1.acreage());
        System.out.println("Acreage h2: " + h2.acreage());
        System.out.println("Acreage h3: " + h3.acreage());
    }
}
