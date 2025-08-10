class Solution {
    public boolean reorderedPowerOf2(int n) {
    char[] digits = String.valueOf(n).toCharArray();
    Arrays.sort(digits);
    for (int i = 0; i < 31; i++) { // Powers of 2 up to 10^9
        char[] powerDigits = String.valueOf(1 << i).toCharArray();
        Arrays.sort(powerDigits);
        if (Arrays.equals(digits, powerDigits)) return true;
    }
    return false;
    }
}