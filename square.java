import java.util.Scanner;
public class square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of row & coloumn");
        
        int n=sc.nextInt();
        for(int i=1;i <=n;i++){
            for(int j=1; j<=n; j++){

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
