
// import java.util.*;
import java.util.concurrent.TimeUnit;

public class Q_4 {
    public static void main(String[] args) {
        // Take input of time in millisecond
        // Display hrs, minutes and second separated with :

        // Sample Input:
        // 100000

        // Sample Output:
        // 00:01:40

        // Scanner sc = new Scanner(System.in);

        // int mili_sec = sc.nextInt();

        int mili_second = 150000;
        // int tot_sec = mili_second / 1000;
        // int hrs = tot_sec / 3600;
        // int min = tot_sec / 60;
        // int sec = tot_sec / 3600;
        // System.out.println(hrs + ":" + min + ":" + sec);
        // System.out.format("%.2f", min);
        // System.out.println(min + sec);
        System.out.format("%02d:%02d:%02d",
                TimeUnit.MILLISECONDS.toHours(mili_second),
                TimeUnit.MILLISECONDS.toMinutes(mili_second),
                TimeUnit.MILLISECONDS.toSeconds(mili_second));

    }
}
