// Maximum Subarray Sum using Prefix Sum
public class SubArrSum{
    public static void subArrSum(int num[]){
        int totalSubArr=0;
        int currSum=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        
        int prefix[]= new int[num.length];
        prefix[0]=num[0];
        // calculating prefix
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currSum= i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                if(currSum>largest){
                    largest=currSum;
                }
                totalSubArr++;
                
            }
        }
        System.out.println("Total no. of sub array : "+totalSubArr);
        System.out.println("Max Sub Array sum : "+largest);
        
    }
    public static void main(String[] args) {
        int num[]={3,5,7,8,9,2};
        subArrSum(num);
    }
}