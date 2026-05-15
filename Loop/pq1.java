//  Display all the number input by user expect multiple of 10 using continue statement

import java.util.Scanner;


public class pq1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.err.print("enter your number : ");
            int n= sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.err.println("You Entered "+n);

        } while (true);
    }
}