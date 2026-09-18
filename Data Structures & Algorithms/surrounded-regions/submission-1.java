class Solution {
    public void solve(char[][] board) {
        int rows= board.length;
        int cols = board[0].length;

        bfs(board);

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void bfs(char[][] board){
        int rows= board.length;
        int cols = board[0].length;
        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if((i==0||j==0||i==rows-1||j==cols-1)&& board[i][j]=='O'){
                    q.offer(new int[]{i,j});
                    board[i][j]='T';
                }
                while(!q.isEmpty()){
                    int[] curr = q.poll();
                    int r= curr[0], c = curr[1];
                    for(int[] d : dir){
                        int nr = r+ d[0];
                        int nc = c + d[1];

                        if(nr>=0 && nr <rows && nc>=0 && nc <cols && board[nr][nc]=='O'){
                            q.offer(new int[]{nr, nc});
                            board[nr][nc]='T';
                        }
                    }                  
                }
            }
        }
    }
}
