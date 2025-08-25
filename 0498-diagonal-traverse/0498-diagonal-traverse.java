class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int d = 1; // 1 = down-right, -1 = up-right
        int row = 0, col = 0;

        for (int i = 0; i < m * n; i++) {
            ans[i] = mat[row][col]; // Store current element

            // Move diagonally
            row -= d; // Move up/down
            col += d; // Move right

            // Handle boundary collisions:
            if (row == m) { // Hit bottom edge
                row = m - 1;
                col += 2;
                d = -d; // Reverse direction
            } else if (col == n) { // Hit right edge
                col = n - 1;
                row += 2;
                d = -d; // Reverse direction
            } else if (row < 0) { // Hit top edge
                row = 0;
                d = -d; // Reverse direction
            } else if (col < 0) { // Hit left edge
                col = 0;
                d = -d; // Reverse direction
            }
        }
        return ans;
    }
}