class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[n-1];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<Math.min(f.length(),l.length());i++){
            if(f.charAt(i)!=l.charAt(i)){
                return ans.toString();
            }
            ans.append(f.charAt(i));
        }
        return ans.toString();
    }
}