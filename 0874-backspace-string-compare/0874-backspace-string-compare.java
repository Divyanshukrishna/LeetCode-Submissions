class Solution {
    public boolean backspaceCompare(String s, String t) {
        return actualEqual(s).equals(actualEqual(t));
    }
    public static String actualEqual(String input){
        int hashNum = 0;
        StringBuilder actualString = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i) == '#'){
                hashNum++;
                continue;
            }
            if(hashNum>0){
                hashNum--;
            }else{
                actualString.insert(0,input.charAt(i));
            }
        }
        return actualString.toString();
    }
}