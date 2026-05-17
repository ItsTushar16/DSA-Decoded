
import java.util.Scanner;

public class Bionomial{
    public static int factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return  fact;
    }
    public static void bionomialCoff(int n , int r){
        int nFact=factorial(n);
        int rFact= factorial(r);
        int nrFact=factorial(n-r);
        int bioCoff= nFact/(rFact*nrFact);
        System.out.println("Bionomial Coffecient is "+ bioCoff);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        bionomialCoff(n, r);

    }
}