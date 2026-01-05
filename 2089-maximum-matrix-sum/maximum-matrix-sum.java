class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long total = 0;
        int minAbs = Integer.MAX_VALUE;
        int c =0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total += Math.abs(matrix[i][j]);
                if(matrix[i][j]<0)c++;
                minAbs = Math.min(minAbs,Math.abs(matrix[i][j]));
            }
        }
        if(c%2 == 1) total -= 2* minAbs;
        return total;
    }
}