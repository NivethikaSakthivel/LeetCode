class Solution {
    public int addDigits(int num) {
        int r,a,s;
        while(num>9){
            a=num;
            s=0;
            while(a>0){
                r=a%10;
                s+=r;
                a/=10;
            }
            num=s;
        }
        return num;
    }
}