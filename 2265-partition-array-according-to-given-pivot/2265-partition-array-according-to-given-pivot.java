class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lCount = 0;
        int pivotCount = 0;
        int gCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == pivot){
                pivotCount++;
            }else if(nums[i] < pivot){
                lCount++;
            }else{
                gCount++;
            }
        }

        int i = 0;
        int j = lCount;
        int k = lCount + pivotCount;
        int[] res = new int[nums.length];
        for(int z : nums){
            if(z == pivot){
                res[j++] = z;
                // j++;
            }else if(z < pivot){
                res[i++] = z;
                // i++;
            }else{
                res[k++] = z;
                // k++;
            }
        }
        return res;
    }
}