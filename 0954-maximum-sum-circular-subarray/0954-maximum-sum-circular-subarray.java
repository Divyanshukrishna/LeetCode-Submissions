class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    int n = nums.length;
    
    if (n == 1) return nums[0];
    
    int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
    int sum1 = 0, sum2 = 0, total = 0;
    
    for (int i = 0; i < n; i++) {
        total += nums[i];
        sum2 = Math.min(nums[i], sum2 + nums[i]);
        mn = Math.min(mn, sum2);
        sum1 = Math.max(nums[i], sum1 + nums[i]);
        mx = Math.max(mx, sum1);
    }
    if (mx < 0) {
        return mx; 
    }
    return Math.max(mx, total - mn);
    }
}