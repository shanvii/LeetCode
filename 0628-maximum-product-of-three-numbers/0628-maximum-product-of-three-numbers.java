class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int prd1 = nums[n] * nums[n-1] * nums[n-2];
        int prd2 = nums[0] * nums[1] * nums[n];
        return Math.max(prd1, prd2);
    }
}