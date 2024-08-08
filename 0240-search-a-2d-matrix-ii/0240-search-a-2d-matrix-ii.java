class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int cr = 0, cc = n-1;
        while(cr < m && cc >= 0) {
            if(matrix[cr][cc] == target)
                return true;
            else if(matrix[cr][cc] < target)
                cr++;
            else
                cc--;
        }
        return false;
    }
}