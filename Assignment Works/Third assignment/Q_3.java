public class Q_3 {
    public static void main(String[] args) {

        // 3. Write a program to print Pattern.
        // ________*
        // ______* *
        // ____* * *
        // __* * * *
        // * * * * *

        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n - i - 1; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
        }
        System.out.println();
    }

}
