class Solution {
    public int lengthOfLastWord(String s) {
        String b = s.stripTrailing();
        int count =0;
        int len=b.length();
        for(int i=len-1;i>=0;i--){
            if(b.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}