class Solution {
public String sortVowels(String s) {
    List<Integer> indexes = new ArrayList<>();
    List<Character> vowels = new ArrayList<>();
    char[] chars = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if ("AEIOUaeiou".indexOf(c) >= 0) {
            indexes.add(i);
            vowels.add(c);
        }
    }
    Collections.sort(vowels);
    for (int i = 0; i < indexes.size(); i++) {
        chars[indexes.get(i)] = vowels.get(i);
    }
    return new String(chars);
}
}