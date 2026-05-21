
import java.util.Scanner;

public class BasicArr{
    public static void main(String[] args) {
        int marks[]= new int[20];   //one way to define array
        String fruits[]= {"apple","mango"}; // another way to declare array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Phy Marks : ");

        marks[0]=sc.nextInt(); // taking input in array

        System.out.print("Enter Che Marks : ");

        marks[1]=sc.nextInt();

        System.out.print("Enter maths Marks : ");

        marks[2]=sc.nextInt();

        System.out.println("Marks of phy :"+ marks[0]);  // array output
        System.out.println("Marks of che :"+ marks[1]);
        System.out.println("Marks of maths :"+ marks[2]);

        marks[1]=100;  // updating array
        System.out.println("Updated che Marks : " + marks[1]);

        marks[2]=marks[2]+10;  //  operation on array
        System.out.println("updated maths Marks(after performing operation on) : " +marks[2]);

        System.out.println("Length of array: "+ marks.length);  // arrName.length --> gives length of array

    }
}