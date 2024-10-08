class Solution {
    public int minSwaps(String s) {
        int open=0,close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                if(open>0){
                    --open;
                }
                else{
                    ++close;
                }
            }
            else{
                open++;
            }
        }   
        return ((close+1)>>1);
    }
}