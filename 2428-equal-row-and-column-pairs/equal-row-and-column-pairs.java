class Solution {
    public int equalPairs(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                boolean equal=true;
                for(int k=0;k<grid.length;k++){
                    if(grid[i][k]!=grid[k][j]){
                       equal=false;
                        break;
                    }
                }
                    if(equal){
                        ans++;
                }
            }
        }
        return ans;
        
    }
}