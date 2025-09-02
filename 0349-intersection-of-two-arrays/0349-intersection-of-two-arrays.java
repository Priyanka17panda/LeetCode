class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        java.util.List<Integer> arr = new java.util.ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            int count = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count++;
                    if (count <= 1 && !seen.contains(nums1[i])) {
                        arr.add(nums1[i]); // add the intersecting value
                        seen.add(nums1[i]);
                    }
                }
            }
        }
        
        int[] newarr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            newarr[i] = arr.get(i);
        }
        return newarr;
    }
}