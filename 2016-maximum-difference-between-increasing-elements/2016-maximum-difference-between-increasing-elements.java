class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int maxDiff = -1;
        for(int i=1;i<nums.length;i++){
            int currDiff = nums[i] - min;
            if(currDiff > 0){
                if(currDiff > maxDiff){
                    maxDiff = currDiff;
                }
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return maxDiff;
    }
}