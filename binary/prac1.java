import java.util.*;

public class Main{
    public static void main(String[]  args){
        int arr[]={1,2,3,4,5};
        int target=4;
        find(arr,target);
        
    }
    public static void find(int[] arr,int target){
        Arrays.sort(arr);
        int low=arr[0];
        int high=arr[arr.length-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
               System.out.println("Target is found "); 
               break;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
    }
}