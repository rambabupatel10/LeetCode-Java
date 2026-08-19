class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>  list=new ArrayList<>();

        int n=matrix.length;
        int startingRow=0;
        int endingRow=matrix.length-1;
        int startingColumn=0;
        int endingColumn=matrix[0].length-1;
        
        while(startingRow <= endingRow && startingColumn <= endingColumn){
            for(int j=startingColumn;j<=endingColumn;j++){
                list.add(matrix[startingRow][j]);
            }
            for(int i=startingRow+1;i<=endingRow;i++){
                list.add(matrix[i][endingColumn]);
            }
            for(int j=endingColumn-1;j>=startingColumn;j--){
                if(startingRow==endingRow){
                    break;
                }
                list.add(matrix[endingRow][j]);
            }
            for(int i=endingRow-1;i>=startingRow+1;i--){
                if(startingColumn==endingColumn){
                    break;
                }
                list.add(matrix[i][startingColumn]);
            }
            startingRow++;
            endingRow--;
            startingColumn++;
            endingColumn--;
        }
        return list;
    }
}