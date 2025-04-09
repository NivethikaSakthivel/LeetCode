class Solution {
    public int minOperations(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        for(int num:nums) min=Math.min(min, num);
        if(min<k) return -1;
        int count=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        return set.size() - (min==k?1:0);
    }
}