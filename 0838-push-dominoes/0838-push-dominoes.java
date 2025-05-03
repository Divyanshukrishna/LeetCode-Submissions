class Solution {
    public String pushDominoes(String dominoes) {
       char[] arr = dominoes.toCharArray();
        int n = arr.length;
        int left = 0;

        while (left < n) {
            if (arr[left] != '.') {
                left++;
                continue;
            }

            int right = left;
            while (right < n && arr[right] == '.') {
                right++;
            }

            char leftChar = (left - 1 >= 0) ? arr[left - 1] : 'L';
            char rightChar = (right < n) ? arr[right] : 'R';

            if (leftChar == rightChar) {
                for (int k = left; k < right; k++) {
                    arr[k] = leftChar;
                }
            } else if (leftChar == 'R' && rightChar == 'L') {
                int l = left, r = right - 1;
                while (l < r) {
                    arr[l++] = 'R';
                    arr[r--] = 'L';
                }
            }
            left = right;
        }
        return new String(arr); 
    }
}