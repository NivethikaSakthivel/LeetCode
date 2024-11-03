class Solution {
    public boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int res=0;
        int m=nums[0].length;
        for(int i=0;i<nums.length;i++){
            if(prime(nums[i][i])){
                res=Math.max(nums[i][i], res);
            }
            if(prime(nums[i][m-1-i])){
                res=Math.max(nums[i][m-1-i], res);
            }
        }
        return res;
    }
}