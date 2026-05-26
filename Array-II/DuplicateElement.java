/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false
*/
public class DuplicateElement{
    public static boolean  findDuplicate(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,1};
        int arr2[]={1,2,3,4};
        int arr3[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println(findDuplicate(arr1));
        System.out.println(findDuplicate(arr2));
        System.out.println(findDuplicate(arr3));
    }
}
