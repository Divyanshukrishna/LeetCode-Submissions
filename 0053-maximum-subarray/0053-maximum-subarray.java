class Solution {
    public int maxSubArray(int[] nums) {
        int currSum =0;
        int maxSumArray = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            maxSumArray = Math.max(currSum,maxSumArray);
            if(currSum < 0){
                currSum =0;
            }
        }
        return maxSumArray;
    }
}