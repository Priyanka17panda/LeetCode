class Solution {
    public int maximumWealth(int[][] accounts) {
        List <Integer> arr= new ArrayList<>();
        int m= accounts.length;
        int n= accounts[0].length;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum+accounts[i][j];
            }
            arr.add(sum);
        }
        int max = Collections.max(arr);
        return max;
    }
}