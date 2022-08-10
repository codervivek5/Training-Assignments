import java.util.*;

public class Q_3 {
    public static void main(String[] args) {

        // Sample Input 0
        // [ 30 120.00 ]
        Scanner sc = new Scanner(System.in);

        int withdraw_amnt = sc.nextInt();
        double tot_amnt = sc.nextDouble();

        if (withdraw_amnt % 5 == 0 && withdraw_amnt >= tot_amnt) {
            Double remain_amnt = (tot_amnt - withdraw_amnt - 0.50);
            System.out.format("%.2f", remain_amnt);

        } else {
            System.out.format("%.2f", tot_amnt);
        }
        sc.close();

    }
}
