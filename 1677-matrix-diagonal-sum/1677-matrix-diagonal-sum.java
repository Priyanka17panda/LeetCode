class Solution {
    public int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int columns=mat[0].length;
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j || i + j == rows - 1){
                    sum = sum+ mat[i][j];
                }
            }
        }
        return sum;

    }
}