class Solution {
    public String reverseVowels(String s) {
        String vow="aeiouAEIOU";
        char[] ch=s.toCharArray();
        int left=0, right=s.length()-1;
        while(left<right){
            while(left<right && vow.indexOf(ch[left])==-1) left++;
            while(left<right && vow.indexOf(ch[right])==-1) right--;
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}