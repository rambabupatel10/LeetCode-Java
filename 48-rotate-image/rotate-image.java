class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int newMat[][]=new int [n][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int newRow=j;
                int newCol=n-i-1;
                newMat[newRow][newCol]=matrix[i][j];
            }
        }
       for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = newMat[i][j];
            }
       }

    }
}