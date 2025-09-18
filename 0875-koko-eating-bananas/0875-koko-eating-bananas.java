import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxBanana(piles);
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int total=totalHours(piles,mid);
            if(total<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int maxBanana(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int totalHours(int num[],int mid){
        int total=0;
        for(int i=0;i<num.length;i++){
           total += (num[i] + mid - 1) / mid;
        }
        return total;
    }
}