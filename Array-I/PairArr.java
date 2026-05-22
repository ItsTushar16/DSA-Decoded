public class PairArr{
    public static void pairArr(int num[]){
        int totalPair=0;
        for(int i=0;i<num.length;i++){
            int curr= num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")");
                totalPair++;
            }
            System.out.println("");
        }
        System.out.println("Total No. of pair: " + totalPair);
    }
    public static void main(String[] args) {
        int num[]={2,4,5,7,8,0};
        pairArr(num);
    }
}