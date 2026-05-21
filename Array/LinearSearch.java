public class LinearSearch{
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[]={45,57,257,267};
        int key1 =257;
        int key2 =2;
        int index1 = linearSearch(num, key1);
        int index2 = linearSearch(num, key2);
        System.out.println("key1 is at index "+ index1);     // 2
        System.out.println("key2 is at index "+ index2);     // -1

    }
}