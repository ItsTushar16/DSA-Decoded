// Find the larget of 2 Number using conditional if-else statement

import java.util.Scanner;



public class largest2Num{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int a , b;
        System.out.print("Enter First no. ");
        a= sc.nextInt();
        System.out.print("Enter Second No. ");
        b = sc.nextInt();
        if(a>b){
            System.out.println(a +" Greater than " + b);

        }
        else{
            System.out.println(b +" Greater than " + a);
        }

    }
}