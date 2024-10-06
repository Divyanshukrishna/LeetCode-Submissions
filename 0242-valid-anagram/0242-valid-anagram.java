class Solution {
    public boolean isAnagram(String s, String t) {
        String char1Array = s.toLowerCase();
        String char2Array = t.toLowerCase();
        if(char1Array.length() == char2Array.length()){
            char[] str1charArray = char1Array.toCharArray();
            char[] str2charArray = char2Array.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            if(Arrays.equals(str1charArray,str2charArray)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}