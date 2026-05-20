// Print the Flyod Triangle
/*
 1
 2 3
 4 5 6
 7 8 9 10
*/

public class FlyodTriangle{
    public static void main(String[] args) {
        int n=4;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println("");
        }
    }
}