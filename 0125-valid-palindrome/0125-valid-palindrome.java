class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        String str=s.toLowerCase();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)){
                sb.append(c);
            }
        }
        String forward=sb.toString();
        String backward=sb.reverse().toString();
        return forward.equals(backward);
    }
}