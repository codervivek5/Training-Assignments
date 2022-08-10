import java.util.*;

public class Q_2 {
    public static void main(String[] args) {

        // Write a program to check whether a triangle is valid or not, when the three
        // angles of the triangle are the inputs. A triangle is valid if the sum of all
        // the three angles is equal to 180 degrees.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum_of_angle = a + b + c;

        if (sum_of_angle == 180) {
            System.out.println("YES");

        } else {
            System.out.println("NO");

        }
        sc.close();

    }
}
