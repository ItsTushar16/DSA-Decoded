public class RevArray{
    public static void revArr(int num[]){
        int start=0,end=num.length-1;
        while(start<end){
            int temp= num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String [] args ){
        int num[]={34,63,27,24};
        revArr(num);
        for(int i=0;i<num.length;i++){
            System.out.print(" "+num[i]);
        }
    }
}