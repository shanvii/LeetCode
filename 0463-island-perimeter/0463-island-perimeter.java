class Solution {
    public int islandPerimeter(int[][] grid) {
        int peri = 0;

        for(int r = 0; r < grid.length; r++)    {
            for(int c = 0; c < grid[r].length; c++) {
                if(grid[r][c] == 1) {
                    peri += 4;
                    if(r > 0 && grid[r-1][c] == 1)  peri -= 2;
                    if(c > 0 && grid[r][c-1] == 1)  peri -= 2;
                }
            }
        }
        return peri;
    }
}