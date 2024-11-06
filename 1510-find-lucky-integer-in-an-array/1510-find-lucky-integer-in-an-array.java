import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int newMap = arr[i];
            
            if(map.containsKey(newMap) == true){
                map.put(newMap, map.get(newMap) + 1);
            }else{
                map.put(newMap,1);
            }
        }
        int ans = -1;
        for(int key : map.keySet()){
            if(map.get(key) == key){
                ans = Math.max(ans,key);
            }
        }
        return ans;
    }
}