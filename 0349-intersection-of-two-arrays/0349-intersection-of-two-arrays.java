class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hp1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hp1.add(nums1[i]);
        }
        HashSet<Integer> hp2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(hp1.contains(nums2[i])) hp2.add(nums2[i]);
        }
        int[] res=new int[hp2.size()];
        int i=0;
        for(int hp:hp2){
            res[i]=hp;
            i++;
        }
        return res;
    }
}