class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 == 1) return false;
        char[] stack = new char[s.length() +2];
        int pointer = 0;
        int len = s.length();
        for(char a : s.toCharArray()){
            if(pointer >= len) return false;
            // System.out.println(pointer);
            switch(a){
                case ')':
                    if(pointer == 0 || stack[pointer] != '(') return false;
                    pointer--;
                    break;
                case '}':
                    if(pointer == 0 ||  stack[pointer] != '{') return false;
                    pointer--;
                    break;
                case ']':
                    if(pointer == 0 ||  stack[pointer] != '[') return false;
                    pointer--;
                    break;
                default:
                    // System.out.println(pointer+1);
                    // pointer++;
                    stack[++pointer] = a;
            }
        }
        // System.out.println(pointer);
        return pointer == 0;
    }
}