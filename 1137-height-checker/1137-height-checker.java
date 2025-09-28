class Solution {
    public int heightChecker(int[] heights) {
        int[] ch = Arrays.copyOf(heights, heights.length);
        Arrays.sort(ch);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i] != ch[i]){
                count++;
            }
        }
        return count;
    }
}