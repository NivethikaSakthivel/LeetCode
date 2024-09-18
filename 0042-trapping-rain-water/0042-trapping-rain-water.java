class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int lmax=Integer.MIN_VALUE, rmax=Integer.MIN_VALUE;
        int res=0;
        while(left<right){
            lmax=Math.max(lmax,height[left]);
            rmax=Math.max(rmax,height[right]);
            res+=lmax<rmax?lmax-height[left++]:rmax-height[right--];
        }
        return res;
    }
}