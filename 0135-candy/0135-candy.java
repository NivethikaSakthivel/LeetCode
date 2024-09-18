class Solution {
    public int candy(int[] ratings) {
        int res=0,n=ratings.length;
	    int[] left=new int[n];
	    int[] right=new int[n];
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
            if(ratings[n-1-i]>ratings[n-i]){
                right[n-1-i]=right[n-i]+1;
            }
        }
        for(int i=0;i<n;i++){
            res+=Math.max(right[i],left[i]);
        }
        return res+n;
    }
}