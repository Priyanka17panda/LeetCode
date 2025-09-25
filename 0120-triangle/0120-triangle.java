class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) return 0;

        List<Integer> dp = new ArrayList<>();
        dp.add(triangle.get(0).get(0));

        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);
            List<Integer> next = new ArrayList<>(row.size());

            // first element
            next.add(dp.get(0) + row.get(0));

            // middle elements
            for (int j = 1; j < row.size() - 1; j++) {
                int val = Math.min(dp.get(j - 1), dp.get(j)) + row.get(j);
                next.add(val);
            }

            // last element
            next.add(dp.get(dp.size() - 1) + row.get(row.size() - 1));

            // move to next row
            dp = next;
        }

        int minSum = Integer.MAX_VALUE;
        for (int v : dp) minSum = Math.min(minSum, v);
        return minSum;
    }
}