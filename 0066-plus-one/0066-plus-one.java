class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list=new ArrayList<>();
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            if(carry+digits[i]>9){
                list.add(0);
                carry=1;
            }
            else{
                list.add(digits[i]+carry);
                carry=0;
            }
        }
        if(carry==1){
            list.add(1);
        }
        int[] res=new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            res[i]=list.get(list.size()-i-1);
        }
        return res;
    }
}