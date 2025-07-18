class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long goodPair = 0;
        long totalPair = n*(n-1)/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = i - nums[i];
            int prevCount = map.getOrDefault(val,0);
            goodPair += prevCount;
            map.put(val,prevCount +1);
        }
        return totalPair - goodPair;
    }
}