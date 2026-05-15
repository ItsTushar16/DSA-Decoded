// reverse the given number

// Method-1
public class revNum{
    public static void main(String [] args){
        int n= 12345;
        int rev=0;
        while(n>0){
            int ld = n%10;
            rev=(rev*10)+ld;
            n/=10;
        }
        System.out.println(rev);
    }
}


// Method-2
public class revNum{
    public static void main(String [] args){
        int n= 12345;
        while(n>0){
            int ld = n%10;
            System.out.print(ld+" ");
            n/=10;
        }
    }
}