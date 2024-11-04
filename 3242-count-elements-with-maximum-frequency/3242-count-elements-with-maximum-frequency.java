class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        int max=0,count=0;
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
            max=Math.max(max,freq.get(i));
        }
        for(int i:nums){
            if(freq.get(i)==max) count++;
        }
        return count;
    }
}