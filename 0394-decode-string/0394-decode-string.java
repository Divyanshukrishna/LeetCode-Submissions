class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch != ']') {
                stack.push(String.valueOf(ch));
            } else {
                StringBuilder sb = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    sb.insert(0, stack.pop());
                }
                stack.pop(); // pop '['
                
                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    num.insert(0, stack.pop());
                }
                int count = Integer.parseInt(num.toString());
                
                String repeated = sb.toString().repeat(count);
                stack.push(repeated);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (String str : stack) {
            result.append(str);
        }
        return result.toString();
    }
}
