public class TrappingRainwater{
    public static int trappedWater(int num[] , int width){
        // calculate leftmax boundary
        int leftMax[]=new int[num.length];
        leftMax[0]=num[0];
        for(int i=1;i<num.length;i++){
            leftMax[i]= Math.max(num[i],leftMax[i-1]);
        }

        //  calculate right max boundary
        int rightMax[]=new int[num.length];
        rightMax[num.length-1]= num[num.length-1];
        for(int i=num.length-2;i>=0;i--){
            rightMax[i]= Math.max(num[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<num.length;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+= (waterLevel-num[i])*width;
        }
        return trappedWater ;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int width=1;
        System.out.println(trappedWater(height, width));
        
    }
}