class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for (int[] indexPair : indices) {
            rowCount[indexPair[0]]++;
            colCount[indexPair[1]]++;
        }

        int oddValueCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rowCount[i] + colCount[j]) % 2 != 0) {
                    oddValueCount++;
                }
            }
        }

        return oddValueCount;
    }
}