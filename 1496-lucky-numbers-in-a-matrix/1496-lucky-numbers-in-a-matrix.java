class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[] minRow = new int[r];
        int[] maxCol = new int[c];
        for (int i = 0; i < r; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] < min) min = matrix[i][j];
            }
            minRow[i] = min;
        }
        for (int j = 0; j < c; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < r; i++) {
                if (matrix[i][j] > max) max = matrix[i][j];
            }
            maxCol[j] = max;
        }
        List<Integer> lucky = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int val = matrix[i][j];
                if (val == minRow[i] && val == maxCol[j]) {
                    lucky.add(val);
                }
            }
        }
        return lucky;
    }
}