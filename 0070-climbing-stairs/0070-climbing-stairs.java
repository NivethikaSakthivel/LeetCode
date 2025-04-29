class Solution {
    public int climbStairs(int n) {
        if(n<4){
            return n;
        }
        int a=2, b=3;
        for(int i=4;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }
}