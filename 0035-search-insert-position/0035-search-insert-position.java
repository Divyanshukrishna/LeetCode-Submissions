class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for(int i=0 ; i< len ; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i++;
            }
            if(nums[len -1] < target){
                return len++;
            }
        }
        return len;
    }
}