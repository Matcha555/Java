package L_57;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double credits = 10; // Số tiền ban đầu
        Scanner pc = new Scanner(System.in);

        Locale lc = new Locale("en", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        int option = 0;
        do {
            System.out.println("--------MENU-------");
            System.out.print("Press (1) to continue or any keys to quit: ");

            option = pc.nextInt();
            if (option == 1) {
                System.out.println("- Start.");
                System.out.println("+ Your money: " + numf.format(credits) + ", how much do you want to bet? ");

                // Đặt cược
                double bet = 0; // số tiền đặt cược
                do {
                    System.out.print("+ You bet: ");
                    bet = pc.nextDouble();
                    if (bet <= 0 || bet > credits) {
                        System.out.println("Fail!, please enter again.");
                    }
                } while (bet <= 0 || bet > credits); // nếu đặt cược < 0 hoặc > credits(5000)
                                                     // thì sẽ không được thực hiện.

                // Chọn tài xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.print("- Selection: (1) - Tai, (2) - Xiu: ");
                    luaChonTaiXiu = pc.nextInt();
                    if (luaChonTaiXiu != 1 && luaChonTaiXiu != 2) {
                        System.out.println("Fail!, please enter again.");
                    }
                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                // Tung xúc xắc
                Random dice1 = new Random();
                Random dice2 = new Random();
                Random dice3 = new Random();

                // Bản chất của nextInt(giá trị từ 0 -> số mình muốn dừng)
                int result1 = dice1.nextInt(5) + 1; // Khi ra kết quả là 0 -> 0+1=1; 5 -> 5+1=6;
                int result2 = dice2.nextInt(5) + 1;
                int result3 = dice3.nextInt(5) + 1;
                int sum = result1 + result2 + result3;

                // Compute
                System.out.println("+ Quay xuc xac: " + result1 + " - " + result2 + " - " + result3);
                if (sum == 3 || sum == 18) // trường hợp này nhà cái ăn hết
                {
                    credits -= bet; // Số tiền ban đầu trừ đi số tiền đặt cược
                    System.out.println("Sum: " + sum + ", you lose.");
                    System.out.println("The remaining money is: " + numf.format(credits));
                } else if (sum >= 4 && sum <= 10) // Xỉu
                {
                    System.out.println("Sum: " + sum + " => Xiu");
                    if (luaChonTaiXiu == 2) // Nếu người chơi chọn 2 thì người chơi sẽ thắng.
                    {
                        credits += bet; // Được cộng tiền vào.
                        System.out.println("-> You win. Your credits is: " + numf.format(credits));
                        System.out.println("");
                    } else {
                        credits -= bet; // Bị trừ tiền vì thua cuộc
                        if (credits > 0) {
                            System.out.println("-> You lose. Your credits is: " + numf.format(credits));
                            System.out.println("");
                        } else {
                            System.out.println("-> Your credits is: " + numf.format(credits));
                            int cho;
                            System.out.print("* Not enought money! (1) to continue or any keys to quit.");
                            cho = pc.nextInt();
                            if (cho == 1) {
                                System.out.print("Add credits: "); // Thêm tiền vào.
                                credits = pc.nextDouble();
                                System.out.println("Your credits: " + numf.format(credits));
                            }
                        }
                    }

                } else // Tài
                {
                    System.out.println("Sum: " + sum + " => Tai");
                    if (luaChonTaiXiu == 1) // Nếu người chơi chọn 1 thì người chơi sẽ thắng.
                    {
                        credits += bet; // Được cộng tiền vào vì chiến thắng.
                        System.out.println("-> You win. Your credits is: " + numf.format(credits));
                        System.out.println("");
                    } else {
                        credits -= bet; // Bị trừ tiền vì thua cuộc
                        if (credits > 0) {
                            System.out.println("-> You lose. Your credits is: " + numf.format(credits));
                            System.out.println("");
                        } else {
                            System.out.println("-> Your credits is: " + numf.format(credits));
                            int cho;
                            System.out.print("* Not enought money! (1) to continue or (2) to quit.");
                            cho = pc.nextInt();
                            if (cho == 1) {
                                System.out.print("Add credits: ");
                                credits = pc.nextDouble();
                                System.out.println("Your credits: " + numf.format(credits));
                            }
                        }
                    }
                }
            }

        } while (option == 1 && credits != 0);
        System.out.println("~~~ See you again ~~~");
    }
}
