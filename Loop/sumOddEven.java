// Write a program that reads a set of integers,and then prints the sum of the even and odd integers

import java.util.Scanner;


public class sumOddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choose =1;
        int num;
        int evenSum =0;
        int oddSum=0;
        do { 
            System.out.print("enter the number");
            num = sc.nextInt();
            if(num % 2 == 0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
            System.out.print("Want to enter more number (1--> yes || 0->> no) : ");
            choose= sc.nextInt();

        } while (choose==1);

        System.out.println("Sum of even number from set of integers is: " + evenSum);
        System.out.println("Sum of odd number from set of integers is: " + oddSum);
        sc.close();
    }
}