
import java.util.Scanner;

public class aq1{
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Num");
        int a = sc.nextInt();
        System.out.println("Enter second Num");
        int b = sc.nextInt();
        System.out.println("Enter third Num");
        int c = sc.nextInt();
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("Avg :" + avg);

    }
}