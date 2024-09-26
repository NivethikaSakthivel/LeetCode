class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        int h=grid.length;
        int w=grid[0].length;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(grid[i][j]==1){
                    ans+=4;
                    if(i>0 && grid[i-1][j]==1){
                        ans-=2;
                    }
                    if(j>0 && grid[i][j-1]==1){
                        ans-=2;
                    }
                }
            }
        }
        return ans;
    }
}