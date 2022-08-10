
/**
 * Q_1
 */
import java.util.*;

public class Q_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // program to read the marks of five subject of student and print their total
        // marks, average marks and percentage.
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double total_marks = a + b + c;
        double avg_marks = (a + b + c) / 3;
        double percentage = ((a + b + c) * 100) / 300;

        System.out.format("Totol marks of subject is: %.2f \n", total_marks);
        System.out.format("Avg. marks is:  %.2f \n", avg_marks);
        System.out.format("percentage is:  %.2f \n", percentage);
        sc.close();
    }
}