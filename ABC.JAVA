public class MixedTrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print letters in ascending order
            for (int j = 0; j < i - 1; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
