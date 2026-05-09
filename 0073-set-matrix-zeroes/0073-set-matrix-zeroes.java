class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        // STEP 1: Find all zeroes
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // STEP 2: Make rows zero
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}