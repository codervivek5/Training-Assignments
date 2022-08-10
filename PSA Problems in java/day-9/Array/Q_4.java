import java.util.*;

public class Q_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first Array: ");
        int size = sc.nextInt();
        int arr1[] = new int[size];

        int arr2[] = new int[size];

        // This code is use to create and storing data in array.
        System.out.println("Enter the element of Array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        // This code is use to create and storing data in array.

        for (int i = 0; i < size; i++) {

            arr2[i] = arr1[i];
        }
        System.out.print("Elements of original array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.print("Elements of dublicate array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
