class Solution {
    int[][] dirs = {
        {1, 0}, {-1, 0},
        {0, 1}, {0, -1}
    };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        Queue<int[]> pq = new LinkedList<>();
        Queue<int[]> aq = new LinkedList<>();

        // Pacific: top row + left column
        for (int i = 0; i < m; i++) {
            pq.offer(new int[]{i, 0});
            pacific[i][0] = true;
        }

        for (int j = 0; j < n; j++) {
            pq.offer(new int[]{0, j});
            pacific[0][j] = true;
        }

        // Atlantic: bottom row + right column
        for (int i = 0; i < m; i++) {
            aq.offer(new int[]{i, n - 1});
            atlantic[i][n - 1] = true;
        }

        for (int j = 0; j < n; j++) {
            aq.offer(new int[]{m - 1, j});
            atlantic[m - 1][j] = true;
        }

        bfs(heights, pq, pacific);
        bfs(heights, aq, atlantic);

        // Find intersection
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void bfs(int[][] heights, Queue<int[]> queue,
                     boolean[][] visited) {

        int m = heights.length;
        int n = heights[0].length;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            int r = curr[0];
            int c = curr[1];

            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                // Boundary check
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                // Already visited
                if (visited[nr][nc]) {
                    continue;
                }

                // Reverse water-flow condition
                if (heights[nr][nc] < heights[r][c]) {
                    continue;
                }

                visited[nr][nc] = true;
                queue.offer(new int[]{nr, nc});
            }
        }
    }
}