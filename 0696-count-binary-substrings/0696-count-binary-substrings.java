class Solution {
    public int countBinarySubstrings(String s) {
        int count1=0,count0=0,res=0;
        boolean break0=false,break1=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='0'){
                count0=break0?1:count0+1;
                if(count1>=count0){
                    res++;
                }
               break0=false;
               break1=true;
            }
            else{
                count1=break1?1:count1+1;
                if(count0>=count1){
                    res++;
                }
               break1=false;
               break0=true;
            }
        }
        return res;
    }
}