//  check waether the year is leap or not
import java.util.Scanner;

public class leapYear{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int year;
        System.out.print("Enter the year : ");
        year= sc.nextInt();
        boolean c1 = year%4 == 0;
        boolean c2 = year%100 !=0;
        boolean c3= (year % 100==0) && (year%400 ==0);
        if(c1 && (c2|| c3)){
            System.out.println(year+" is a leap year ");
        }
        else{
            System.out.println(year +" not a leap year ");

        }

    }
}