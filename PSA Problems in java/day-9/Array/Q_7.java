import java.util.*;
import java.util.Arrays;

public class Q_7 {

    public static void main(String[] args) {
        // Write a java program to count fequency of each element in an array.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int feq[] = new int[size];
        Arrays.fill(feq, -1);

        System.out.println("Enter the elements of element: ");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    feq[j] = 0;

                }

            }
            if (feq[i] != 0) {
                feq[i] = count;

            }

        }

        System.out.println("The fequency of all elements of array: ");

        for (int i = 0; i < size; i++) {
            if (feq[i] != 0) {
                System.out.println(arr[i] + " Occurs " + feq[i] + " times ");
            }
        }

        sc.close();

    }
}