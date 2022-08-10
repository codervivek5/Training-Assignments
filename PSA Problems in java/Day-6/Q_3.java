import java.util.*;

public class Q_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t, s;

        t = sc.nextInt();
        s = sc.nextInt();

        while (t--) {
            switch (s % 12) {
                case 0:
                    System.out.println("WS ", s - 11);
                    break;
                case 1:
                    System.out.println("MS ", s + 11);
                    break;
                case 2:
                    System.out.println("AS ", s + 10);
                    break;

            }
        }

    }
}
