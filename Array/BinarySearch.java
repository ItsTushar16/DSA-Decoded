public class BinarySearch{
    public static int binarySearch(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]<key){
                start=mid+1;
            }
            else if(num[mid]>key){
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int num[]={45,50,55,60,65,70,75,80};
        int key1 =70;
        int key2 =30;
        int index1 = binarySearch(num, key1);
        int index2 = binarySearch(num, key2);
        System.out.println("key1 is at index "+ index1);     // 5
        System.out.println("key2 is at index "+ index2);     // -1

    }
}
