class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int cr = 0, cc = col - 1;
        int count = 0;

        while (cr < row && cc >= 0) {
            if (grid[cr][cc] >= 0) {
                cr++;
            } else {
                count += row-cr;
                cc--;
            }
        }
        return count;
    }
}