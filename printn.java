import java.util.Scanner;

public class printn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();


        int a=1;
        for(int i=1; i<=n;i++){
            
            for(int j=1;j<2*i-1;j++){
                System.out.print(2*j-1+" ");
                a+=2;
                
            }
            System.out.println();
        }
    }
    
}

    

