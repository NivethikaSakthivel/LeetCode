class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
         int count = 0;
        int n = tickets.length;
        for (int i = 0; tickets[k] > 0; i = (i + 1) % n) {
            if (tickets[i] > 0) {
                tickets[i]--;
                count++; 
            }
        }
        return count;
    }
}