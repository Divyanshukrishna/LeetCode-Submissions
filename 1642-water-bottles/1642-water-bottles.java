class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int newBottle = numBottles / numExchange;
            int remBottle = numBottles % numExchange;
            ans += newBottle;
            numBottles = newBottle + remBottle;
        }
        return ans;
    }
}