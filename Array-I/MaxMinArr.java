public class MaxMinArr{
    public static void maxMin(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }

        }
        System.err.println("Largest Value : " + largest);
        System.err.println("Smallest Value : " + smallest);

    }
    public static void main(String[] args) {
        int num[]= {57,85,875,853,9990};
        maxMin(num);
    }
}