import java.util.*;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        // Array declaration
        int number[] = new int[size];
        int pos = 3;
        // int arr2[] = new int[size + 1];

        // storing the number in array

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = size - 1; i < pos - 1; i--) {

            number[i] = number[i - 1];
        }
        System.out.println("Enter the element which you want to insert: ");
        int x = sc.nextInt();

        number[pos - 1] = x;
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }

        // System.out.println("Elements of the Array is");
        // for (int i = 0; i < size; i++) {
        // System.out.println(number[i]);

        // }

        // System.out.println("Enter the element which you want to insert: ");
        // int ele = sc.nextInt();
        // for (int i = 0; i < size + 1; i++) {
        // // System.out.println(number[i + 1] + ele);
        // arr2[i] = number[i];

        // }
        // arr2[size] = x;

        sc.close();

    }
}
