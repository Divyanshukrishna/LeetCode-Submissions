class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> no = new HashSet<>();
        for (int i : nums) {
            if (!no.contains(i)) {
                no.add(i);
            } else {
                no.remove(i);
            }
        }
        return no.iterator().next(); 
    }
}
