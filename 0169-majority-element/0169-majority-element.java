class Solution {
    public int majorityElement(int[] nums) {
        int me=0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                me = nums[i];
                count = 1;
            } else if (nums[i] == me) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == me) {
                count1++;
            }
        }
        if(count1 > (nums.length / 2)){
            return me;
        }else{
            return -1;
        }
    }
}