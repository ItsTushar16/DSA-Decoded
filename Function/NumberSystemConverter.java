//  Write a function which convert binary to decimal and decimal to binary

import java.util.Scanner;

public class NumberSystemConverter{
    public static boolean isBinary(int n) {
        if (n < 0) {
            return false;
        }
        while (n > 0) {


            int digit = n % 10;

            if (digit != 0 && digit != 1) {
                return false;
            }

            n /= 10;
        }

        return true;
    }

    public static int  binaryToDecimal(int n){
        int pow=0;
        int dec=0;
        while (n>0) {
            int ld =n%10;
            dec=dec+(ld* (int)Math.pow(2, pow));
            pow++;
            n/=10;
            
        }
        return dec;
    }
    public static int decToBin(int n){
        int binNum=0;
        int pow=0;
        while(n>0){
            int rem= n%2;
            binNum= binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Select Conversion(1 or 2) :-");
        System.out.println("1.Binary to Decimal 2.Decimal To Binary ");
        int choose=sc.nextInt();
        switch (choose) {
            case 1:
                System.out.print("Enter Binary no. : ");
                int num=sc.nextInt();
                
                if (!isBinary(num)) {
                    System.out.println("Invalid Binary Number");
                    break;
                }

                int dec= binaryToDecimal(num);
                System.out.println("Decimal form of "+num+" is: "+dec);
                break;
            case 2:
                System.out.print("Enter Decimal no. : ");
                int binNum=sc.nextInt();
                int bin= decToBin(binNum);
                System.out.println("Binary form of "+binNum+" is: "+bin);
                break;
            default:
                System.out.println("Choose Correct Option (1 or 2)");
        }
        
        sc.close();
        
    }
}