import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // C program to enter length and breadth of a rectangle and find its area.
        int l = sc.nextInt();
        int b = sc.nextInt();

        int area = l * b;
        System.out.println(area);
        sc.close();
    }
}
