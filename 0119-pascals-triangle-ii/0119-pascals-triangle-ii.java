class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> prev = triangle.get(i-1);
            List<Integer> new_row = new ArrayList<>();

            new_row.add(1);
            for(int j = 1; j < i; j++) {
                new_row.add(prev.get(j-1) + prev.get(j));
            }
            new_row.add(1);

            triangle.add(new_row);
        }
        return triangle.get(rowIndex);
    }
}