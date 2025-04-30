class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int evenCount = 0;
        for(int i=0;i<nums.length;i++){
            int s = nums[i];
            count = countDigit(s);
            if(count %2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
    public int countDigit(int s){
        int count = 0;
        while(s!=0){
            int d = s%10;
            count++;
            s /=10;
        }
        return count;
    }
}