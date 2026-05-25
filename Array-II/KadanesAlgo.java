// Maximum Subarray Sum using Kadanes algo ,

public class KadanesAlgo{
    public static void maxSubArrSum(int num[]){
        if (num == null || num.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int currSum=0;
        int maxSum= num[0];
        for(int i=0;i<num.length;i++){
            currSum= currSum+num[i];
            
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("Max Sub Array Sum: " + maxSum);
    }
    public static void main(String[] args) {
        int num[]= {-2,-3,4,-1,-2,1,5,-3};  // 7
        maxSubArrSum(num);
        int num1[]= {-2,-3,-9,-23}; //-2
        maxSubArrSum(num1);
        int num2[]= {-2,-3,0,-9,-54}; //0
        maxSubArrSum(num2);
    }
}
