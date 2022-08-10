import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // program to enter temperature in Fahrenheit and convert to Celsius.
        // Formula c=5*(f-32)/9

        double Fahren = sc.nextDouble();

        double celc = 5 * (Fahren - 32) / 9;

        System.out.println(celc);
        sc.close();

    }
}
