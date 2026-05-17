
import java.util.Scanner;

public class Factorial{
    public static void factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial : "+ fact);
   
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value : ");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Factorial: 1");
        }
        else if(num<0){
            System.out.println("Give postive value");
        }
        else{
            factorial(num);
        }
        sc.close();
    }
}