class Solution {
    public int compareVersion(String version1, String version2) {
        String[] f1 = version1.split("\\."); 
        String[] f2 = version2.split("\\."); 
        int max = Math.max(f1.length, f2.length);

        for (int i = 0; i < max; i++) {
            int v1 = i < f1.length ? Integer.parseInt(f1[i]) : 0;
            int v2 = i < f2.length ? Integer.parseInt(f2[i]) : 0;

            if (v1 > v2) return 1;
            if (v1 < v2) return -1;
        }
        return 0;
    }
}