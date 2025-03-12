class Solution {
    public int maximumCount(int[] nums) {
        int countn=0,countz=0;
        for(int num:nums){
            if(num<0){
                countn++;
            }
            if(num==0){
                countz++;
            }
        }
        return countn>nums.length-countn-countz? countn: nums.length-countn-countz;
    }
}