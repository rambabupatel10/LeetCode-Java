class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int element=1;

        int startingRow=0;
        int endingRow=matrix.length-1;
        int startingColumn=0;
        int endingColumn=matrix[0].length-1;
        
        while(startingRow <= endingRow && startingColumn <= endingColumn){
            for(int j=startingColumn;j<=endingColumn;j++){
                matrix[startingRow][j]=element;
                element++;
            }
            for(int i=startingRow+1;i<=endingRow;i++){
                matrix[i][endingColumn]=element;
                element++;
            }
            for(int j=endingColumn-1;j>=startingColumn;j--){
                // if(startingRow==endingRow){
                //     break;
                // }
                matrix[endingRow][j]=element;
                element++;
            }
            for(int i=endingRow-1;i>=startingRow+1;i--){
                // if(startingColumn==endingColumn){
                //     break;
                // }
                matrix[i][startingColumn]=element;
                element++;
            }
            startingRow++;
            endingRow--;
            startingColumn++;
            endingColumn--;
        }
        return matrix;
    }
}