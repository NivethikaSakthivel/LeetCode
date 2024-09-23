class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        char[] hexchars="0123456789abcdef".toCharArray();
        StringBuilder res=new StringBuilder();
        int rem;
        while(num!=0){
            rem=num&15;
            res.insert(0,hexchars[rem]);
            num>>>=4;
        }
        return res.toString();
    }
}