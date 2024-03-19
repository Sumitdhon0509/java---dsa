public class bothstring {
    public static void main(String[] args) {
        int rows = 5; 
        String numberStr = "";
        String letterStr = "";

        for (int i = 1; i <= rows; i++) {
            
            numberStr += i + " ";
            
            letterStr += (char) ('A' + i - 1) + " ";

            
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            
            System.out.print(numberStr);
            
            System.out.println(letterStr);
        }
    }
}
