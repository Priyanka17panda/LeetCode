class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int sr =0;
        int sc =0;
        int er= matrix.length-1;
        int ec=matrix[0].length-1;
        while (sr <= er && sc <= ec) {
            // Traverse from left to right on the top row
            for (int j = sc; j <= ec; j++) {
                result.add(matrix[sr][j]);
            }
            // Traverse from top to bottom on the rightmost column
            for (int i = sr + 1; i <= er; i++) {
                result.add(matrix[i][ec]);
            }
            // Traverse from right to left on the bottom row, if there is a bottom row left
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) {
                    result.add(matrix[er][j]);
                }
            }
            // Traverse from bottom to top on the leftmost column, if there is a left column left
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) {
                    result.add(matrix[i][sc]);
                }
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return result;
    }
}