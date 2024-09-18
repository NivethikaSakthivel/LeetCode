class Solution {
    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swapfun(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swapfun(nums,mid,high);
                high--;
            }
        }
    }
    public void swapfun(int[] nums, int num1, int num2){
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}