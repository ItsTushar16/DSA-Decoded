// factorial of a number

import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= sc.nextInt();
        int fact=1;
        if(num<0){
            System.out.println("Enter a positive number");
        }
        else if(num == 0){
            System.out.println("Factorial of "+ num + " is : 1" );
        }
        else{
            for(int i=2;i<=num;i++){
                fact*=i;
            }
            System.out.println("Factorial of "+ num + " is : " + fact );

        }
        sc.close();

    }
}