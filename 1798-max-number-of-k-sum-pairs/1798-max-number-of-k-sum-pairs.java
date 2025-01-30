class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left=0,right=nums.length-1;
        while(left<right){
            int temp=nums[right]+nums[left];
            if(temp==k){
                count++;
                left++;
                right--;
            }
            else if(temp<k){
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}