class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arrays=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            arrays.add(1);
        }
        for (int i = 2; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                arrays.set(j, arrays.get(j) + arrays.get(j - 1));
            }
        }
        return arrays;
    }
}