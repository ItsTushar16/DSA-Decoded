public class SubArr{
    public static void subArr(int num[]){
        int totalSubArr=0;
        int largest=0;

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+ " ");
                    sum+=num[k];
                }
                System.out.println("--> Sum : " +sum );
                if(sum>largest){
                    largest=sum;
                }
                totalSubArr++;
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("Total no. of sub array : "+totalSubArr);
        System.out.println("max sum of a sub array : "+largest);
    }
    
    public static void main(String[] args) {
        int num[]={3,5,7,8,9,2};
        subArr(num);
        
    }
}