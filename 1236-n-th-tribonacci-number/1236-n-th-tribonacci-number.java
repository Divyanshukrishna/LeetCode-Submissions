class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        int firstTerm = 0, secondTerm = 1, thirdTerm = 1, fourthTerm;
        for(int i=1;i<=n;i++){
            fourthTerm = firstTerm+thirdTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fourthTerm; 
        }
        return firstTerm;
    }
}