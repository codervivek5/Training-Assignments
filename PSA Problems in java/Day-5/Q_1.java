
/**
 * Q_1
 */
// import java.time.format.SignStyle;
import java.util.*;

public class Q_1 {
    // Problem Statement

    // Mr. Rijul has some problem in calculation. He wants a software that can
    // perform calculation for him. He needs a software that can take two numbers
    // and perform operation according to the user choice using switch case.

    // "+" for addition
    // "-" for subtraction
    // "*" for multiplication
    // "/" for division
    // "%" for remainder
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int a, b;
        // char sign;

        int a = sc.nextInt();
        int b = sc.nextInt();
        char sign = sc.next().charAt(0);

        switch (sign) {
            case '+': {

                System.out.println(a + b);
                break;
            }

            case '-': {
                System.out.println(a - b);
                break;
            }
            case '*': {
                System.out.println(a * b);
                break;
            }
            case '/': {

                System.out.println(a / b);
                break;
            }
            case '%': {

                System.out.println(a % b);
                break;
            }

            default: {
                System.out.println("Enter perfect operator:");
                // return;
            }

        }
        sc.close();
    }

}
