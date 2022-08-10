import java.util.*;

public class Q_2 {
    public static void main(String[] args) {

        // handshake problem
        // formula -> [n*(n-1)]/2

        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();
        // int n = 1;

        int tot_hand_shake = (person * (person - 1)) / 2;
        System.out.println(tot_hand_shake);
        sc.close();
    }
}
