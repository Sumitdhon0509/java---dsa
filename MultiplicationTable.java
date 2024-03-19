import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = sc.nextInt();

        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}
