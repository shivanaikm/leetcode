class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int count=0;
       while(i<nums.length){
        if(nums[i]!=0){
            nums[count]=nums[i];
            count++;
        }
        
        i++;
       }
       for(int j=count;j<nums.length;j++){
            nums[j]=0;
        }
    }
}