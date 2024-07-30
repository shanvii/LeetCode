class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sq = new int[nums.length];
        for(int i = 0; i < sq.length; i++) {
            sq[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(sq);
        return sq;
    }
}