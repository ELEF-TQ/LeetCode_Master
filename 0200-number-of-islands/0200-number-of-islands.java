class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    BFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void BFS(char[][] grid, int i, int j) {
        // current index is out of bounds or is water ('0')
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }

        // current cell is visited
        grid[i][j] = '0';

        // Perform BFS on all 4 directions
        BFS(grid, i - 1, j); // Up
        BFS(grid, i + 1, j); // Down
        BFS(grid, i, j - 1); // Left
        BFS(grid, i, j + 1); // Right
    }
}
