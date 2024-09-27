class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> res=new ArrayList<>();
        for(int n:nums){
            if(res.isEmpty() || res.get(res.size()-1)<n){
                res.add(n);
            }
            else{
                int idx=binsearch(res,n);
                res.set(idx,n);
            }
        }
        return res.size();
    }
    public int binsearch(List<Integer> arr, int target){
        int l=0,r=arr.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            else if(arr.get(mid)>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}