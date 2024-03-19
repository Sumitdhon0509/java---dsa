import java.util.Scanner;

public class numapl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                // Print alphabets for even rows, and numbers for odd rows
                if (i % 2 == 0) {
                    System.out.print((char) (i + 63) + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

    

