class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> rowCount = new HashMap<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        for (int i = 0; i < m; i++) {
            StringBuilder row = new StringBuilder();
            StringBuilder invertedRow = new StringBuilder();
            
            // Build the row and its inverted version
            for (int j = 0; j < n; j++) {
                row.append(matrix[i][j]);
                invertedRow.append(1 - matrix[i][j]); // Invert the value (0 -> 1, 1 -> 0)
            }
            
            String rowStr = row.toString();
            String invertedRowStr = invertedRow.toString();
            
            // Count the frequency of the row and its inverted version
            rowCount.put(rowStr, rowCount.getOrDefault(rowStr, 0) + 1);
            rowCount.put(invertedRowStr, rowCount.getOrDefault(invertedRowStr, 0) + 1);
        }
        
        // Find the maximum frequency
        int maxRows = 0;
        for (int count : rowCount.values()) {
            maxRows = Math.max(maxRows, count);
        }
        
        return maxRows;
    }
}