
public class Q_1 {
    public static void main(String[] args) {
        // 1. Write a program to print Pattren.
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }
    }

}