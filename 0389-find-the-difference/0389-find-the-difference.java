class Solution {
    public char findTheDifference(String s, String t) {
    char c=0;
    for(int i:s.toCharArray()){
        c^=i;
    }
    for(int j:t.toCharArray()){
        c^=j;
    }
    return c;
    }
}