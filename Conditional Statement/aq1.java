// Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;

public class aq1{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Enter the Number ");
        num = sc.nextInt();
        if(num<0){
            System.out.println("The number you entered is negative");
        }
        else{
            System.out.println("The number you entered is positive");
        }
    }
}