import java.util.*;

public class Q_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int n = 9;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {

            if (i < 10) {
                for (int j = a; j < 10; j++) {
                    if (j / 2 == 0) {
                        System.out.println(j);
                    } else {
                        System.out.println(j);

                    }

                }
            }

            else if (a >= b) {
                for (int j = 10; j <= b; j++) {
                    if (i / 2 == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");

                    }

                }

            }
        }
    }
}
