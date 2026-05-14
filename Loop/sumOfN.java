// Sum of first N natural number

import java.util.Scanner;


public class sumOfN{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of N ");
        int n= sc.nextInt();
        int sum=0;
        int m=0;
        while(m<n+1){
            sum+=m;
            m++;
        }
        System.out.println("Sum of natural number till "+ n + " is "+ sum);
    }
}