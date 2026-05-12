
import java.util.Scanner;

public class aq2{
    public static void main( String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Enter value of pen :");
        float pen = sc.nextFloat();
        System.out.println("Enter value of eraser :");
        float eraser = sc.nextFloat();
        float total = pen+ pencil+eraser;

        float gst=total*0.18f;
        float amt= total+gst;
        System.out.println("Total Amount To Be paid with GST " + amt);
        

    }
}