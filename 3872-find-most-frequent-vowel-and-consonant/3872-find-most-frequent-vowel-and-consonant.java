class Solution {
    public int maxFreqSum(String s) {
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            char charac = s.charAt(i);
            freq[charac-'a']++;
        }
        int mv=0;
        int mc=0;
        for(int j=0;j<freq.length;j++){
            char curr= (char) (j+'a');
            if(curr=='a'||curr=='e'||curr=='i'||curr=='o'||curr=='u'){
                mv=Math.max(mv,freq[j]);
            }else{
                mc=Math.max(mc,freq[j]);
            }
        }
        return mv+mc;
    }
}