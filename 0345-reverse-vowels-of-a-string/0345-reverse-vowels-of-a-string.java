class Solution {
    public String reverseVowels(String s) {
        String vow="aeiouAEIOU";
        String ch="";
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(vow.contains(String.valueOf(cur))){
                ch+=s.charAt(i);
            }
        }
        int j=ch.length()-1;
        String res="";
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(vow.contains(String.valueOf(cur))){
                res+=ch.charAt(j);
                j--;
            }
            else{
                res+=s.charAt(i);
            }
        }
        return res;
    }
}