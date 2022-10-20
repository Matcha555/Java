//https://www.youtube.com/watch?v=3oqiOP7QxUk&list=LL&index=6&t=5889s

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookList {

    /*
     * Hãy nghĩ, làm sao để truyền arrList vào hàm countGreaterThan10?
     * Do hàm countGreaterThan10 ở ngoài hàm main, arrList ở trong hàm main
     * -> không thể truyền arrList vào hàm countGreaterThan10
     */

    // 1. Đếm số lượng book có price > 10$
    // Khai báo tương tự như "int a": int - ArrayList<Book>, a - list
    public void f1(ArrayList<Book> list) // truyền ArrayList<Book> list vào hàm countGreaterThan10
    {

        // Đầu tiền tạo biến count = 0;
        int count = 0;
        // Duyệt từ đầu đến cuối list
        for (Book o : list) // list truyền vào o
        {
            if (o.getPrice() > 10) // Lấy price(getPrice()) của từng phần tử o so sánh với 10
            {
                count++;
            }
        }
        System.out.println("- Price > 10$: " + count + " books.");
    }

    // 2. Đếm số lượng book có price > 10$ & price < 20$
    public void f2(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getPrice() > 10 && o.getPrice() < 20)
                count++;

        }
        System.out.println("- Price > 10$ & < 20$: " + count + " books.");
    }

    // 3. Hiện thị thông tin book ở vị trí số 5
    public void f3(ArrayList<Book> list) {
        // index = 5;
        System.out.println("Element 5th: " + list.get(5)); // list.get(5): cả cụm này là object(o). Sau khi gọi o có
                                                           // nghĩa là gọi tới hàm toString() rồi in ra.
                                                           // get(5) tương đương với b5(arrayList)
    }

    // 4. Add a new book to Arraylist
    public void f4(ArrayList<Book> list) {
        // trước tiên phải tạo một đối tượng mới.
        Book b6 = new Book("Mickey", 6, 52, "truyen tranh");
        list.add(b6);

        System.out.println("- After adding new element: ");
        // in ra man hinh
        for (Book o : list) {
            System.out.println(o);
        }
    }

    // 5. Add an element to the 4th position
    public void f5(ArrayList<Book> list) {
        Book b7 = new Book("O Long Vie", 7, 36, "truyen dai");
        list.add(4, b7); // add(vi_tri_muon_chen, doi_tuong_can_chen)
                         // add(4, b7): b7 được chèn vào vị trí thứ 4.

        System.out.println("- After adding an element to the 4th position: ");
        // in ra man hinh
        for (Book o : list) {
            System.out.println(o);
        }
    }

    // 6. Update lại brand của quyển sách ở vị trí số 4 thành “ truyen dai ”
    public void f6(ArrayList<Book> list) {
        list.get(4).setBrand("truyen dai"); // get(4) tương đương với b4(arrayList)
        System.out.println("- Update brand: ");
        System.out.println(list.get(4));
    }

    // 7. Remove the book at 3rd position
    public void f7(ArrayList<Book> list) {
        list.remove(3);

        System.out.println("- After removing the book at 3rd position: ");
        for (Book o : list) {
            System.out.println(o);
        }
    }

    // 8.Hiển thị số lượng sách có brand = "truyen tranh"
    public int f8(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getBrand().contains("truyen tranh")) {
                count++; // số lượng tăng lên 1, rồi quay lại đoạn trên, duyệt từ đấu đến cuối o
                         // có "truyen tranh" thì đếm tiếp -> tổng cộng 3 truyện tranh.
            }
        }
        return count;
    }

    // đếm số lượng sách có tên bắt đầu bằng chữa 't'
    public int f9(ArrayList<Book> list) {
        int count = 0;
        for (Book o : list) {
            if (o.getName().charAt(0) == 'T') {
                count++;
            }
        }
        return count;
    }

    // Giảm giá 10% và update lại giá sách
    public void f10(ArrayList<Book> list) {
        for (Book o : list) {
            o.setPrice(o.getPrice() * 0.9);
            System.out.println(o);
        }

    }

    // Nếu truyện có brand là "truyện dài" thì giảm giá 20%
    public void f11(ArrayList<Book> list) {
        for (Book o : list) {
            double price = o.getPrice() * 0.8;
            if (o.getBrand().equals("truyen dai")) {
                o.setPrice(price);
                System.out.println(o);
            }
        }

    }

    // Sắp xếp tăng dần theo code
    public void f12(ArrayList<Book> list) {
        // collections
        // Hàm giúp chúng ta sắp xếp một cái danh sách theo một thuộc tính nào đấy.
        Collections.sort(list, new Comparator<Book>() // Giao diện Comparator được sử dụng để sắp xếp các đối tượng của
                                                      // lớp do người dùng định nghĩa
        {
            @Override
            public int compare(Book o1, Book o2) // compare: hàm so sánh o1 và o2; o1, o2 là biến hàm tự có sẵn
            {
                // khi muốn sắp xếp tăng dần theo cái gì đấy, theo kiểu int, chỉ cần o1.get... -
                // o2.get... -> sắp xếp tăng dần
                return o1.getCode() - o2.getCode();
                /*
                 * khi hàm này return về số dương( có nghĩa là o1.getCode > o2.getCode) -> đổi
                 * chỗ o1 và o2
                 * còn o1.getCode < o2.getCode -> return về số âm -> không đổi chỗ, giữ nguyên
                 * vị trí
                 */

                // còn nếu muốn sắp xếp giảm dần thì đổi chỗ o1 và o2:
                // return o2.getCode() - o1.getCode();
            }
        });
        for (Book o : list) {
            System.out.println(o);
        }
    }

    // Sắp xếp tăng dần theo name
    public void f13(ArrayList<Book> list) {
        // collections
        // Hàm giúp chúng ta sắp xếp một cái danh sách theo một thuộc tính nào đấy.
        Collections.sort(list, new Comparator<Book>() // Giao diện Comparator được sử dụng để sắp xếp các đối tượng của
                                                      // lớp do người dùng định nghĩa
        {
            @Override
            public int compare(Book o1, Book o2) // compare: hàm so sánh o1 và o2; o1, o2 là biến hàm tự có sẵn
            {
                // muốn so sánh 2 string với nhau thì dùng hàm compareToIgnoreCase hoặc
                // compareTo
                return o1.getName().compareToIgnoreCase(o2.getName());
                // nếu name1 đứng trước name1 ( a đứng trước b) -> số âm
                // nếu name1 đứng sau name2 -> số dương
            }
        });
        for (Book o : list) {
            System.out.println(o);
        }
    }

    // sắp xếp tăng dần theo price
    public void f14(ArrayList<Book> list) {
        // collections
        // Hàm giúp chúng ta sắp xếp một cái danh sách theo một thuộc tính nào đấy.
        Collections.sort(list, new Comparator<Book>() // Giao diện Comparator được sử dụng để sắp xếp các đối tượng của
                                                      // lớp do người dùng định nghĩa
        {
            @Override
            public int compare(Book o1, Book o2) // compare: hàm so sánh o1 và o2; o1, o2 là biến hàm tự có sẵn
            {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1; // đổi chỗ o1.getPrice và o2.getPrice
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1; // không đổi chỗ
                } else {
                    return 0; // thích đổi hay không đổi cũng được.
                }
            }
        });
        for (Book o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        // Tạo ArrayList cho Book(Book được truyền vào arrList)
        ArrayList<Book> arrList = new ArrayList<>();

        // Để truyền được dữ liệu thì có những đối tượng cần truyền vào
        // Truyền qua constructor không có tham số
        Book b0 = new Book();
        b0.setName("Conan");
        b0.setCode(5);
        b0.setPrice(3);
        b0.setBrand("truyen dai");

        // Truyền qua constructor có tham số
        Book b1 = new Book("Doremon", 1, 8, "truyen tranh");
        Book b2 = new Book("One Piece", 4, 16, "truyen dai");
        Book b3 = new Book("Tam Cam", 2, 34, "truyen dai");
        // b3.setName("Shin"); // Change name

        // Có thể truyền biến như thế này
        String name4 = "Mat biec";
        int code4 = 0;
        double price4 = 22;
        String brand4 = "truyen tranh";
        Book b4 = new Book(name4, code4, price4, brand4);
        Book b5 = new Book("Ty Quay", 3, 3, "truyen tranh");

        // Xong khi tạo xong các phần tử trong constructor thì phải thêm vào arrList
        arrList.add(b0);
        arrList.add(b1);
        arrList.add(b2);
        arrList.add(b3);
        arrList.add(b4);
        arrList.add(b5);

        // dùng vòng For each để duyệt từ đầu đến cuối arrList
        for (Object o : arrList) // o: từng object(b0,b1,b2,b3,b4)
        /*
         * Phân biệt:
         * for(int i=0,...) -> i là từng vị trí,
         * còn for(Object o: ) -> o là từng giá trị
         */
        {
            // trước tiên, muốn in ra các biến thì phải có toString(), quay lại class Book
            // để viết hàm toString()
            System.out.println(o);
        }

        // Muốn truy cập một hàm nào đấy thì phải tạo ra một đối tượng
        BookList bl = new BookList();
        // bl.f1(arrList);
        // bl.f2(arrList);
        // bl.f3(arrList);
        // bl.f4(arrList);
        // bl.f5(arrList);
        // bl.f6(arrList);
        // bl.f7(arrList);

        // int count = bl.f8(arrList); /*
        // * vì hàm f8 chỉ trả về giá trị(không in gì hêt)
        // * cho nên tạo một biến count = bl.f8 để lấy được giá trị mà nó trả về
        // */
        // System.out.println("- Brand(truyen tranh): " + count);
        // System.out.println();

        // int count1 = bl.f9(arrList);
        // System.out.println("- Number of books starting with the letter 'T': " +
        // count1);
        // System.out.println();

        // System.out.println("- After 10% off: ");
        // bl.f10(arrList);

        // System.out.println("- Giam gia 20%: ");
        // bl.f11(arrList);

        System.out.println("- Sap xep theo code: ");
        bl.f12(arrList);

        System.out.println("- Sap xep theo name: ");
        bl.f13(arrList);

        System.out.println("- Sap xep theo price: ");
        bl.f14(arrList);
    }
}
