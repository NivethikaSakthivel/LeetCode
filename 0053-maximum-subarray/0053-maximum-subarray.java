class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int cursum=nums[0];
        for(int i=1;i<nums.length;i++){
            cursum=Math.max(nums[i], cursum+nums[i]);
            sum=Math.max(sum,cursum);
        }
        return sum;
    }
}