class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOne = 0;
        int rowCo = 0;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOne) {
                maxOne=count;
                rowCo=i;
            }
        }
        return new int[] { rowCo, maxOne };
    }
}