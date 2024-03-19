import java.util.Scanner;

public class SumofDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sum of digits: ");
        int n = sc.nextInt();

        int sum = 0;
        int originalNumber = n; // Store the original number for printing later

        while (n != 0) {
            int digit = n % 10; // Get the rightmost digit
            sum += digit; // Add the digit to the sum
            n /= 10; // Remove the rightmost digit
        }

        System.out.println("Sum of digits in " + originalNumber + " = " + sum);
    }
}
 
    

