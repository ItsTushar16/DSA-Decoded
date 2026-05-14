// print Num 1 to n where n is user unput using while loop

import java.util.Scanner;
public class printNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n= sc.nextInt();
        int m =1;
        while(m<n+1){
            System.out.println(m);
            m++;
        }
        
    }
}

