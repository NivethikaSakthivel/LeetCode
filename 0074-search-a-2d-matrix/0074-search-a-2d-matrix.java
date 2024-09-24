class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target==matrix[mid][0] || target==matrix[mid][m-1]){
                return true;
            }
            if(target>matrix[mid][0] && target<matrix[mid][m-1]){
                return binarysearch(matrix,mid,target);
            }
            if(target<matrix[mid][0]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
    public boolean binarysearch(int[][] matrix, int row, int target){
        int left=0,right=matrix[0].length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target==matrix[row][mid]){
                return true;
            }
            if(target<matrix[row][mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}