class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String result="";
        while(i<word1.length() && j<word2.length()){
            result+=word1.charAt(i);
            result+=word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length()){
            result+=word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            result+=word2.charAt(j);
            j++;
        }
        return result;
        // int n=Math.min(word1.length(),word2.length());
        // StringBuilder res=new StringBuilder();
        // for(int i=0;i<n;i++){
        //     res.append(word1.charAt(i));
        //     res.append(word2.charAt(i));
        // }
        // if(word1.length()>word2.length()){
        //     res.append(word1.substring(n,word1.length()));
        // }
        // if(word1.length()<word2.length()){
        //     res.append(word2.substring(n,word2.length()));
        // }
        // return res.toString();
    }
}