class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int[] result = new int[2];

        // First, find any occurrence of the target
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                // Target found; now find the start and end indices
                result[0] = mid; // Start with mid as the start index
                result[1] = mid; // Start with mid as the end index
                
                // Expand left to find the first occurrence
                while (result[0] > 0 && nums[result[0] - 1] == target) {
                    result[0]--;
                }
                
                // Expand right to find the last occurrence
                while (result[1] < nums.length - 1 && nums[result[1] + 1] == target) {
                    result[1]++;
                }
                
                return result; // Return the range
            } else if (target > nums[mid]) {
                low = mid + 1; // Move right
            } else {
                high = mid - 1; // Move left
            }
        }

        return new int[]{-1, -1}; // Target not found
    }
}