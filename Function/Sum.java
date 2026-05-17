
import java.util.Scanner;

public class Sum{

    public static void  sum(int a,int b){  // here we call a,b is formal parameter or parameter
        int sum = a+b;
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter first number: ");
        int b = sc.nextInt();
        sum(a, b);  // here we call  a,b is argument or actual parameter
    }
}