class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;  
        int b = nums2.length;  
        int c = a + b;  
        int[] c1 = new int[c];    
        for (int i = 0; i < a; i++) {  
            c1[i] = nums1[i];  
        }  
        for (int i = 0; i < b; i++) {  
            c1[a + i] = nums2[i];  
        }   
        Arrays.sort(c1);    
        double median;  
        if (c % 2 == 0) {  
            median = (c1[c / 2 - 1] + c1[c / 2]) / 2.0;  
        } else {  
            median = c1[c / 2];  
        }  
        return median;  
    }
}