import java.util.*;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // program to enter base and height of a triangle and find its area.

        int b = sc.nextInt();
        int h = sc.nextInt();

        int area = (b * h) / 2;
        System.out.println(area);
        sc.close();

    }
}
