class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int rotation = 0; rotation < 4; rotation++) {
            boolean match = true;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {

                    if (mat[i][j] != target[i][j]) {
                        match = false;
                        break;
                    }
                }
                if (!match) {
                    break;
                }
            }
            if (match) {
                return true;
            }
            int n = mat.length;
            int[][] temp = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    int newRow = j;
                    int newCol = n - i - 1;

                    temp[newRow][newCol] = mat[i][j];
                }
            }

            mat = temp;
        }

        return false;
    }
}