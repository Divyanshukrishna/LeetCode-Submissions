class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = (n + k - 1) / k; 
        String[] result = new String[size];

        int index = 0; 
        for (int i = 0; i < n; i += k) {
            int end = Math.min(i + k, n);
            String part = s.substring(i, end);

            if (part.length() < k) {
                StringBuilder sb = new StringBuilder(part);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                part = sb.toString();
            }

            result[index++] = part;
        }

        return result;
    }
}