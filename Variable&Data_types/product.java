
import java.util.Scanner;

public class product {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a: \n");
        int a= sc.nextInt();
        System.out.print("enter value of b: \n");

        int b = sc.nextInt();
        int product = a*b;
        System.out.print(product);
    }
}