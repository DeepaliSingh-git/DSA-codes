class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int count=0;
        int rows=grid.length-1;
        int columns= grid[0].length-1;

        for(int i=0; i<=rows; i++){
            for(int j=0; j<=columns; j++){
                if(grid[i][j]==1){
                    count+=4;

                if(i>0 && grid[i-1][j]==1) count--;
                if(i<rows && grid[i+1][j]==1) count--;
                if(j>0 && grid[i][j-1]==1) count--;
                if(j<columns && grid[i][j+1]==1) count--;
                }
            }
        }
        return count;
    }
}