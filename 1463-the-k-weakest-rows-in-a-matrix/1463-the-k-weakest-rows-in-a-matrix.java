class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        int[] sum=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int j=0;
            for(;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    break;
                }
            }
            sum[i]=j*mat.length+i;
        }
        Arrays.sort(sum);
        for(int i=0;i<mat.length;i++){
            sum[i]=sum[i]%mat.length;
        }
        return Arrays.copyOfRange(sum,0,k);
    }
}