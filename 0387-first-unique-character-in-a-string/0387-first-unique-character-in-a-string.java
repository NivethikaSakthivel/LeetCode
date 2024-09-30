class Solution {
    public int firstUniqChar(String s) {
        char[] c=s.toCharArray();
        int[] letters=new int[26];
        for(char ch:c){
            letters[ch-'a']++;
        }
        for(int i=0;i<c.length;i++){
            if(letters[c[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}