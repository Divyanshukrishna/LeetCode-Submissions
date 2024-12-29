class Solution {
    public int sumOfUnique(int[] nums) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(var i:map.entrySet()){
            if(i.getValue() == 1){
                count += i.getKey();
            }
        }
        return count;
    }
}