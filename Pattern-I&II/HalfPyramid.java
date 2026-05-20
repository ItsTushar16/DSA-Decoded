// Print the half pyramid pattern

/*
    1
    1 2 
    1 2 3 
    1 2 3 4 

*/

/*  Print rotated and half pyramid pattern

    1234
    123
    12
    1

*/

public class HalfPyramid{
    public static void halfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }
    public static void halfRotatedPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        halfPyramid(4);
        halfRotatedPyramid(4);
    }
}