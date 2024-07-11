import java.util.*;

public class Main{
    public static void main(String[]  args){
        int arr[]={1,2,3,4,5};
        int target=4;
        int res=find(arr,target,0);
        System.out.println(res);
        
    }
    public static int find(int[] arr,int target,int ans){
        Arrays.sort(arr);
        int low=arr[0];
        int high=arr[arr.length-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return ans;
    }
}