import java.util.*;

public class Q_3 {
    public static void main(String[] args) {

        // program to check whether a year is leap year or not.

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("Leap");

        } else {
            System.out.println("Non Leap");

        }
        sc.close();

    }
}
