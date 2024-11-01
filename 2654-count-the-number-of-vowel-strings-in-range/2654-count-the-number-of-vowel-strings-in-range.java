class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            String s=words[i].toUpperCase();
            if((s.startsWith("A") || s.startsWith("E") || s.startsWith("I") || s.startsWith("O") || s.startsWith("U")) && (s.endsWith("A") || s.endsWith("E") || s.endsWith("I") || s.endsWith("O") || s.endsWith("U"))){
                res++;
            }
        }
        return res;
    }
}