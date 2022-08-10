import java.util.*;

public class Q_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float total_price = sc.nextInt();
            float Gst = sc.nextInt();

            float actual_price = (total_price * 100) / (100 + Gst);

            // System.out.format(new DecimalFormat("##.##").format(actual_price));

            System.out.format("%.2f%n", actual_price);
            System.out.format("%.2f%n", total_price - actual_price);
            System.out.format("%.2f%n", total_price);

        }

    }
}
