class Solution {
    public int jump(int[] nums) {
        int sum=0, count=0, a=0;
        for(int i=0;i<nums.length-1;i++){
            sum=Math.max(sum, nums[i]+i);
            if(a==i){
                a=sum;
                count++;
            }
        }
        return count;
    }
}