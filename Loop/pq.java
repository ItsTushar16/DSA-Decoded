//  take the input till user input multiple of 10

import java.util.Scanner;


public class pq{
    public static void main(String [] args){
        int n;
        Scanner sc= new Scanner(System.in);
        do { 
            System.out.print("Enter the number ");
            n= sc.nextInt();
        } while(n%10!=0);
    }
}