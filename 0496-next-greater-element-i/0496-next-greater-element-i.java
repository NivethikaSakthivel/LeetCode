class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[n1];
        for(int i:nums2){
            while(!stack.isEmpty() && stack.peek()<i){
                map.put(stack.pop(),i);
            }
            stack.push(i);
        }
        for(int i=0;i<n1;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}