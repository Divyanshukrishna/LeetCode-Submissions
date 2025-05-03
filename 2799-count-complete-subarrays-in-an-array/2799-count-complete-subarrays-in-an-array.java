class Solution {
    public int countCompleteSubarrays(int[] nums) {    
        int n = nums.length;

        Set<Integer> distinctSet = new HashSet<>();
        for (int num : nums) {
            distinctSet.add(num);
        }
        int totalDistinct = distinctSet.size();

        int left = 0, count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            while (freqMap.size() == totalDistinct) {
                count += n - right;

                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }
        }

        return count;
    }
}