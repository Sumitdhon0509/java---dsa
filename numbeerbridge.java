import java.util.Scanner;

public class numbeerbridge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();
        
        // Print upper part of the pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print increasing sequence
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print decreasing sequence
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
        
        // Print lower part of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print increasing sequence
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print decreasing sequence
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}