import java.util.Scanner;

public interface twoip {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a/b);

    }
    
}
