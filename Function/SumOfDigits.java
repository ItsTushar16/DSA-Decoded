// Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class SumOfDigits {

    public static int sumDigits(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit;

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int sum = sumDigits(n);

        System.out.println("Sum of digits is: " + sum);

        sc.close();
    }
}