class Solution {
    public int orangesRotting(int[][] grid) {
        int res = 0, fresh = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        int dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1)
                    fresh++;
                if (grid[i][j] == 2) {
                    q.offer(new int[] {i, j});
                }
            }
        }
        while (fresh > 0 && !q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int curr[] = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int d[] : dir) {
                    int nr = d[0] + r;
                    int nc = d[1] + c;
                    if (nr >= 0 && nr < rows && nc >= 0 
                    && nc < columns && grid[nr][nc] == 1) {
                        q.offer(new int[] {nr, nc});
                        grid[nr][nc] = 2;
                        fresh--;
                    }
                }
            }
            res++;
        }
        return fresh == 0 ? res : -1;
    }
}
