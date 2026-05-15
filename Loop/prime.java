// check weather the number is prime or not

import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        boolean isPrime= true;
        int n= sc.nextInt();

        if(n==2){
            System.out.println(n+" is a prime number ");
        }
        else if(n<=1){
            System.out.println("enter greater than 1");
        }
        else{
            for(int i= 2; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
            }
        }
    }
}