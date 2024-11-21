class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        // Environment to represent grid...
        int environment[][] = new int[m][n];
        int g = guards.length, w = walls.length;
        // Placing all the guards...
        for(int i = 0; i < g; i++)
            environment[guards[i][0]][guards[i][1]] = 1;
        // Placing all the walls...
        for(int i = 0; i < w; i++)
            environment[walls[i][0]][walls[i][1]] = -1;
        // Function Call to mark all guarded Cells...
        markGuardedCells(guards, environment);
        // Four Types of Cells - guard(1), wall(-1), marked(2), empty(0)...
        return totalUnguardedCells(environment);
    }

    public void markGuardedCells(int[][] guards, int[][] environment) {
        int len = guards.length;
        // Marking all cardinal directions for each guard...
        for(int i = 0; i < len; i++)
            markCardinals(guards[i][0], guards[i][1], environment);
    }

    public void markCardinals(int i, int j, int grid[][]) {
        int x = i-1, y = j;
        int m = grid.length, n = grid[0].length;
        // Marking Cells on top...
        while(x >= 0 && grid[x][y] != -1 && grid[x][y] != 1) {
            grid[x][y] = 2; x--;
        }
        x = i+1;
        // Marking Cells on Bottom...
        while(x < m && grid[x][y] != -1 && grid[x][y] != 1) {
            grid[x][y] = 2; x++;
        }
        x = i; y = j-1;
        // Marking Cells on Left...
        while(y >= 0 && grid[x][y] != -1 && grid[x][y] != 1) {
            grid[x][y] = 2; y--;
        }
        y = j+1;
        // Marking Cells on Right...
        while(y < n && grid[x][y] != -1 && grid[x][y] != 1) {
            grid[x][y] = 2; y++;
        }
    }

    public int totalUnguardedCells(int grid[][]) {
        int total = 0, m = grid.length, n = grid[0].length;
        // Counting the total number of unmarked (0) cells...
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(grid[i][j] == 0) total++;
        return total;
    }
}