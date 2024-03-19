import java.util.Scanner;

public class numberebridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Print the first row of numbers
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= n - 1; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }
            
            int rightNum = n - i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(++rightNum + " ");
            }
            System.out.println();
        }
    }
}
