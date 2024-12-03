class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int extraCounter = 0; 
        
        for (int space : spaces) {
            sb.insert(space + extraCounter, ' '); 
            extraCounter++; 
        }
        
        return sb.toString();
    }
}