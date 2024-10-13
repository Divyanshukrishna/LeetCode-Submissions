class Solution {
    public int removeDuplicates(int[] nums) {
        int indexNum = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] != nums[i]){
                nums[indexNum] = nums[i];
                indexNum++;
            }
        }
        return indexNum;
    }
}