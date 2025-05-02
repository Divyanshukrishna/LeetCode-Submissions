class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; 
        int maxFrequency = 0;      
        int i = 0;                 
        int maxLength = 0;        

        for (int j = 0; j < s.length(); j++) {
            count[s.charAt(j) - 'A']++;
            maxFrequency = Math.max(maxFrequency, count[s.charAt(j) - 'A']);

            if ((j - i + 1) - maxFrequency > k) {
                count[s.charAt(i) - 'A']--;
                i++; 
            }

            maxLength = Math.max(maxLength, j - i + 1);
        }

        return maxLength;
    }
}
