import java.util.*;

public class Q_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, k, mand = 0, mor = 0, mxor = 0;

        n = sc.nextInt();
        k = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // System.out.println(i + " " + j); to check combination

                if ((i & j) > mand && (i & j) > k) {
                    mand = i & j;
                    System.out.println("and of the value is: " + mand);

                }
                if ((i | j) > mor && (i | j) > k) {
                    // System.out.println();
                    mand = i | j;

                }
                if ((i ^ j) > mxor && (i ^ j) > k) {
                    // System.out.println();
                    mand = i ^ j;

                }

            }
        }
        System.out.println(mand + "\n" + mor + "\n" + mxor);

    }
}
