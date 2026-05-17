// Print the range of prime no till n (n is user input)
import java.util.Scanner;

public class PrimeInRange{
    // isPrime Function Check wheather the function is prime or not
    public static boolean isPrime(int n){
        if (n <= 1) {
        return false;
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    // Print prime numbers in range
    public static void primeRange(int n){
        if(n<=1){
            System.out.println("Enter value greater than 1 because prime no. start from 2");
            return;
        }
        System.out.print("Prime Number till " + n +" is : " );
        for(int i=2;i<=n;i++){
            boolean isPrime =isPrime(i);
            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value till which you want Prime Number: ");
        int n=sc.nextInt();
        primeRange(n);
        
    }
}