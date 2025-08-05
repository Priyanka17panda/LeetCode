class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = nums[0];
        int currentProduct = 1;

        for (int i = 0; i < n; i++) {
            currentProduct = 1;
            for (int j = i; j < n; j++) {
                currentProduct *= nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }
}