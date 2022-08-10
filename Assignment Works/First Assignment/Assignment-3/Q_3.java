import java.util.*;
import java.util.concurrent.TimeUnit;

public class Q_3 {
    public static void main(String[] args) {

        // program to read a time in milliseconds and convert it into hours, minutes and
        // seconds.

        Scanner sc = new Scanner(System.in);
        int mili_second = sc.nextInt();

        System.out.format("%02d:%02d:%02d",
                TimeUnit.MILLISECONDS.toHours(mili_second),
                TimeUnit.MILLISECONDS.toMinutes(mili_second),
                TimeUnit.MILLISECONDS.toSeconds(mili_second));

        sc.close();
    }
}
