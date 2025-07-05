class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxIn = -1;

        for (Integer key : map.keySet()) {
            if (key.equals(map.get(key))) {
                maxIn = Math.max(maxIn, key);
            }
        }

        return maxIn;
    }
}