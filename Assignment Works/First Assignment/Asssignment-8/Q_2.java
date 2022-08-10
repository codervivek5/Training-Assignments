public class Q_2 {
    public static void main(String[] args) {
        // butter fly pattern

        int n = 5;
        // upper side

        for (int i = 1; i <= n; i++) {
            // left side

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            int space = 2 * (n - i);

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }

            // right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // left side

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            int space = 2 * (n - i);

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }

            // right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
