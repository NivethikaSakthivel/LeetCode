class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target){
                n++;
            }
            else if(nums[i]==target){
                return i;
            }
            else{
                return n;
            }
        }
        return n;
    }
}