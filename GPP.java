import java.util.Scanner;

public class GPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        //1,3,12,48.....
        int a=3;
        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            a*=4;
            
        }
    }
    
}
