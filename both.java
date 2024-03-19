public  class both  {
    public static void main(String[] args) {
        int rows = 5; 
        char letter = 'A'; 

        for (int i = 1; i <= rows; i++) {
             
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print(letter);
                letter++;
            }
           
            letter = 'A';
            System.out.println();
        }
    }
}
 
