class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                result[1] = i;
                if(result[0] == -1)
                    result[0] = i;
            }
        }
        return result;
    }
}