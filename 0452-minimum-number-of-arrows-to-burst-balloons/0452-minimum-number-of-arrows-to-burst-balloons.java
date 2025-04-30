class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int count=1, last=points[0][1];
        for(int i=1;i<points.length;i++){
            if(last<points[i][0]){
                last=points[i][1];
                count++;
            }            
        }
        return count;
    }
}