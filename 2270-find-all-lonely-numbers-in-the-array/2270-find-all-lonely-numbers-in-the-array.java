class Solution {
    public List<Integer> findLonely(int[] nums){
        Arrays.sort(nums); 
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
       for (int i = 0; i < n; i++) {
            if ((i == 0 || nums[i] - nums[i - 1] > 1) && 
                (i == n - 1 || nums[i + 1] - nums[i] > 1)) { 
                list.add(nums[i]);
            }
        }

        return list;
    }
}