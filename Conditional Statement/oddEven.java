
//check wheather the number is even or odd using conditional if-else statement

import java.util.Scanner;


public class oddEven{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter the num ");
        num = sc.nextInt();
        if(num/2 == 0){
            System.out.print("The Number you enter is a Even Number");
        }
        else{
            System.out.print("The number you enter is a Odd Number");
        }
    }
}