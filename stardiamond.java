import java.util.Scanner;

public class stardiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int nsp = n - 1; // Number of spaces
        int nst = 1; // Number of stars

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }

        nsp = 1;
        nst -= 4;

        // Lower half of the diamond
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }
}
