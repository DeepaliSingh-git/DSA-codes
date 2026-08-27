class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        int max_count=0;
        int rows=grid.length;
        int columns = grid[0].length;
        int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};

        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){

                if(grid[i][j]==1){
                    int count=1;
                    q.offer(new int[]{i,j});
                    grid[i][j]=0;

                    while(!q.isEmpty()){
                        int[] curr = q.poll();
                        int r=curr[0];
                        int c=curr[1];

                        for(int[] d:dir){
                            int nr=r+d[0];
                            int nc=c+d[1];

                            if(nr>=0 && nr<rows && nc>=0 && nc<columns && grid[nr][nc]==1){
                                q.offer(new int[]{nr,nc});
                                grid[nr][nc]=0;
                                count++;
                            }

                        }

                    }
                    max_count= Math.max(count, max_count);
                }
            }
        }
        return max_count;
    }
}
