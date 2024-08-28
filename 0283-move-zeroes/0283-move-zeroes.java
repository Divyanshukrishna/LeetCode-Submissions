class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        
        // First pass: move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        
        // Second pass: fill the remaining positions with zeros
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
