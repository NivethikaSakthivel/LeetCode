class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOR=0;
        for(int num:nums){
            maxOR|=num;
        }
        int[] count=new int[1];
        backtrack(nums,0,0,maxOR,count);
        return count[0];
    }
    public void backtrack(int[] nums, int index, int curOR,int maxOR, int[] count){
        if(curOR==maxOR){
            count[0]++;
        }
        for(int i=index;i<nums.length;i++){
            backtrack(nums,i+1,curOR|nums[i],maxOR,count);
        }
    }
}