class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr1){
            while(num>0){
                set.add(num);
                num/=10;
            }
        }
        int res=0;
        for(int num:arr2){
            while(num>0){
                if(set.contains(num)){
                    res=Math.max(res,num);
                }
                num/=10;
            }
        }
        if(res==0){
            return 0;
        }
        StringBuilder str=new StringBuilder(String.valueOf(res));
        return str.length();
    }
}