class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0, sum = 0;
        Set<Integer> seen = new HashSet<>();
        int l = 0;
        
        for (int r = 0; r < nums.length; r++) {
            while (!seen.add(nums[r])) {
                sum -= nums[l];
                seen.remove(nums[l]);
                l++;
            }
            sum += nums[r];
            ans = Math.max(ans, sum);
        }
        
        return ans;
    }
}