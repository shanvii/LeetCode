class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = { -1, -1 };
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                result[0] = left;
                result[1] = right;
                break;
            }
            if (nums[left] != target)
                left++;
            if (nums[right] != target)
                right--;
        }
        return result;
    }
}