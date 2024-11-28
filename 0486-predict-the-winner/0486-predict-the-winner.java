class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n]; 
        int[][] rangeSum = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                if(j==i)
                    rangeSum[i][j] = nums[i];
                else
                    rangeSum[i][j] = nums[j] + rangeSum[i][j-1];
                dp[i][j]= -1;
            }
        }
        topDown(0, n-1, dp, rangeSum);
        return dp[0][n-1] >= rangeSum[0][n-1] - dp[0][n-1]; 
    }
    
    public void topDown(int start, int end, int[][] dp, int[][] rangeSum){
        if(start<0 || end >= dp.length || dp[start][end] != -1)
            return;
        else if(start == end){
            dp[start][end] = rangeSum[start][end];
        }
        else{
            topDown(start+1, end, dp, rangeSum);
            topDown(start, end-1, dp, rangeSum);
            dp[start][end] = Math.max(rangeSum[start][end] - dp[start+1][end], rangeSum[start][end] - dp[start][end-1]) ;
        }
    }
}