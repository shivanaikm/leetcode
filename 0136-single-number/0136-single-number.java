class Solution {
    public int singleNumber(int[] nums) {
        //XOR method
        int result=0;
        for(int i:nums){
            result^=i;
        }
        return result;
    }
}
