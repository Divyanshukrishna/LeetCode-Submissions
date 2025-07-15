class Solution {
    public boolean isValid(String word) {
        if (word.length() < 4) 
            return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) 
                return false;

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                hasVowel = true;
            } else if (Character.isLetter(ch)) {
                hasConsonant = true;
            }
        }

        return hasVowel && hasConsonant;
    }
}
