class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        int max=0, maxnum=nums[0];
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
            if(freq.get(num)>max){
                max=freq.get(num);
                maxnum=num;
            }
        }
        return maxnum;
    }
}