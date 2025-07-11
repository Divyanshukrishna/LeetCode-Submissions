class Solution {
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
           return true;
        return false;
    }
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int i = 0;
        int j = n - 1;

        while(i<j){
            if(!isVowel(chars[i])){
                i++;
            }else if(!isVowel(chars[j])){
                j--;
            }else{
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                i++;
                j--;
            }
        }
        return new String(chars);
    }
}