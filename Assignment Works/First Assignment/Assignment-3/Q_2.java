import java.util.*;

public class Q_2 {

    public static void main(String[] args) {

        // program that accepts an employee's ID, total worked hours of a month and the
        // amount he received per hour. Print the employee's ID and salary (with two
        // decimal places) of a particular month.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employee_ID = sc.nextInt();

        System.out.print("Enter total_worked_hours: ");
        double total_worked_hours = sc.nextDouble();

        System.out.print("Enter amont_per_hours: ");
        double amont_per_hours = sc.nextDouble();

        double salary = total_worked_hours * amont_per_hours;

        System.out.println("Your Employee ID is:- " + employee_ID);
        System.out.printf("Your salary is: %.2f", salary);

        sc.close();

    }
}
