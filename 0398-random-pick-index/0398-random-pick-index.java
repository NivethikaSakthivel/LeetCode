class Solution {
    int[] nums;
    Random random;
    public Solution(int[] nums) {
        this.nums=nums;
        this.random=new Random();
    }
    
    public int pick(int target) {
        while(true){
            int nextInt=random.nextInt(nums.length);
            if(nums[nextInt]==target){
                return nextInt;
            }
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */