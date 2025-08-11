class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> arr = new ArrayList<>();   
        int max=0;
        for(int j=0;j<candies.length;j++){
            if(candies[j]>max){
                max=candies[j];
            }
        }
        for(int i=0;i<candies.length;i++){
                arr.add(candies[i]+extraCandies>=max);
        }
        return arr;
    }
}