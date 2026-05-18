/* Question2: Write a method named isEven that accepts an int argument.The method should return true
 if the argument iseven,or false otherwise.Also write a program to test your method.  */

 public class aq2{
    public static boolean isEven(int n){
        boolean isEven = true;
        if(n%2==0){
            isEven=true;
        }
        else{
            isEven=false;
        }
        return isEven;
    }
    public static void main(String[] args) {
        System.out.println(isEven(6));
    }
 }