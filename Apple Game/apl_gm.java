import java.util.*;

public class apl_gm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------\n");
        System.out.println("!!__Ye hai Apple vala Game, Dam hai to jeet kar dikhao__!!\n");
        System.out.println("--------------------------------------------------------");

        System.out.println("Pure 21 Apple hai, yad rkhna apko bs jyada se jyada 4 hi lene hai\n");
        System.out.println("Pahle ap apna nam bataye ?");
        String user_name = sc.next();

        // -----------------------------------------------------------
        int total = 21;

        int user_number = 0;
        int computer_number = 0;
        int remain = 0;

        while (true) {
            System.out.print(user_name + " Ji apko kitne apples lene hai? ");
            user_number = sc.nextInt();
            if (user_number < 5) {

                remain = total - user_number;

                System.out.println("Ab bache hai " + remain + " apples.\n");

                while (true) {
                    if (remain > 1) {
                        computer_number = 5 - user_number;
                        System.out.println("Computer ji ne liye hai :" + computer_number + " apples.");
                        remain = remain - computer_number;
                        if (remain > 1) {

                            System.out.println("\nAb bache hai " + remain + " apples.\n");
                            System.out.print(user_name + " Ji ab apko kitne apples lene hai? ");
                            user_number = sc.nextInt();
                            remain = remain - user_number;
                            continue;
                        }
                    } else {
                        System.out.println("\nApke pas '1' bache hai__ Congratulations ap har chuke hai :) \n");
                        System.out.println("Computer se jitna muskil hi nhi namunkin hai! :)");
                        break;
                    }
                }
                break;
            } else {
                System.out.println("!!!! " + user_name + " Ji apko jyada se 4 apples hi lene hai.\n");

                continue;
            }
        }

        sc.close();
    }
}