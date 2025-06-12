class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(nums[i] - nums[i + 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        // Check circular adjacency (last and first element)
        int circularDiff = Math.abs(nums[0] - nums[n - 1]);
        if (circularDiff > maxDiff) {
            maxDiff = circularDiff;
        }

        return maxDiff;
    }
}