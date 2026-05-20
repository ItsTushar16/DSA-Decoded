/*  Print Inverted Star :-
    * 
    * * 
    * * * 
    * * * * 
*/

/*  Print Inverted and rotated star

          *  
       *  *  
    *  *  *  
 *  *  *  * 
 
*/
public class InvertedStar{
    public static void invertedStar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void invertedRotatedStar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        invertedStar(4);
        invertedRotatedStar(4);
    }
}