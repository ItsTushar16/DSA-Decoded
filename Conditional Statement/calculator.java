
import java.util.Scanner;

// create a simple calculator using switch
public  class calculator{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num1,num2;
    char operator;
    int result;
    System.out.print(" Enter the First Number :");
    num1= sc.nextInt();
    System.out.print(" Enter the operator you want to perform(+,-,*,%,/) :");
    operator= sc.next().charAt(0);
    System.out.print(" Enter the Second Number ");
    num2= sc.nextInt();

    switch (operator) {
        case '+':
            result= num1+ num2;
            System.out.println(result);
            break;
        case '-':
            result= num1-num2;
             System.out.println(result);
             break;
        case '*':
            result= num1*num2;
             System.out.println(result);
             break;
        case '/':
            result= num1/num2;
            System.out.println(result);
            break;
        case '%':
            result= num1%num2;
             System.out.println(result);
             break;
        default:
            System.out.println("Unexpected Input");      
    }

    }
}