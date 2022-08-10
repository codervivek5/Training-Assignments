import java.util.*;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input only four digit
        // Input: N = 1934 Output: 1, 9, 3, 4
        // Input: N = 1032 Output: 1, 0, 3, 2

        int number = sc.nextInt();
        String s = Integer.toString(number);
        // string to_str = Integer.toString();

        System.out.println(s.charAt(0) + ", " + s.charAt(1) + ", " + s.charAt(2) + ", " + s.charAt(3));
        sc.close();

    }
}
