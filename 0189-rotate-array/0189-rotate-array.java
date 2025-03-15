class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reversenum(nums, 0, n-1);
        reversenum(nums, 0, k-1);
        reversenum(nums, k, n-1);
    }
    public static void reversenum(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}