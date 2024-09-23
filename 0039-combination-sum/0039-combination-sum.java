class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        fun(0,arr,candidates,target,ans);
        return ans;
    }
    public void fun(int ind, List<Integer> arr,int[] candidates, int target, List<List<Integer>> ans){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(candidates[ind]<=target){
            arr.add(candidates[ind]);
            fun(ind,arr,candidates,target-candidates[ind],ans);
            arr.remove(arr.size()-1);
        }
        fun(ind+1,arr,candidates,target,ans);
    }
}