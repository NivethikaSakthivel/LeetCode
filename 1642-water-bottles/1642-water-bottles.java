class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        while(numBottles>=numExchange){
            int rem=numBottles%numExchange;
            res+=numBottles/numExchange; 
            numBottles=rem+(numBottles/numExchange);                   
        }
        return res;
    }
}