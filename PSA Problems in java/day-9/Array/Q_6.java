import java.util.*;

public class Q_6 {
    public static void main(String[] args) {
        // Write a JAva program to delete an element from an array at specified
        // position.
        Scanner sc = new Scanner(System.in);

        // int flag = 1, loc = 0;
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Enter the element which you want to delete: ");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {

            if (x == number[i]) {
                for (int j = i; j < size - 1; j++) {
                    number[j] = number[j + 1];

                }
                break;

            }

        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(number[i] + " ");

        }
        sc.close();
    }
}
