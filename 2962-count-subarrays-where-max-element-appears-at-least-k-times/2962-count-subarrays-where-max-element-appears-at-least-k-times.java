class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxi = 0;
        for(int num:nums){
            maxi = Math.max(num,maxi);
        }

        int maxOccur = 0;
        int left = 0;
        long res = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == maxi) 
                maxOccur++;
            
            while(maxOccur >= k){
                if(nums[left] == maxi) 
                    maxOccur--;
                left++;
            }
            res +=left;
        }
        return res;
    }
}