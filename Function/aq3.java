

/* Write a Java program to check if a number is a palindrome in Java?
(121 is a palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number
e.g.,121 is a palindrome because the reverse of 121 is 121 itself.
On the otherhand,321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
*/

import java.util.Scanner;

public class aq3{
    public static boolean isPalindrome(int n){
        int num=n;
        int rev=0;
        while(num>0){
            int ld=num%10;
            rev=(rev*10)+ld;
            num/=10;
        }
        return n==rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome:  ");
        int n= sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("this no. is palindrome");
        }
        else{
            System.out.println("this is not a palindrome");

        }
        sc.close();
    }
}