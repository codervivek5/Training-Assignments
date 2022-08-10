import java.util.*;

public class demo {
    public static void main(String[] args) {

        // Write a program to input and print array elements.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
        int x = 6;
        for (int i = 0; i < size + 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < size; i++) {

            System.out.println(arr[i]);
        }

        // for (int i = 0; i < size; i++) {
        // sum = sum + arr[i];

        // }
        // System.out.println(sum);

    }
}
