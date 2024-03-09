
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char operator;
        while (true) {
            System.out.println("Enter the first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            num2 = sc.nextInt();
            System.out.println("Enter the operator: ");
            operator = sc.next().charAt(0);
            if (operator == '+') {
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
            } else if (operator == '-') {
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
            } else if (operator == '*') {
                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
            } else if (operator == '/') {
                System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue? (Y/N)");
            char ch = sc.next().charAt(0);
            if (ch == 'N') {
                break;
            }
        }
        sc.close();
    }
}
