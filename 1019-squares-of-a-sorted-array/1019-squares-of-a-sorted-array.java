class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int arr[] = new int[nums.length];
        int k = arr.length - 1;
        while(left <= right) {
            if(Math.abs(nums[left]) > nums[right]) {
                arr[k] = nums[left] * nums[left];
                k--;
                left++;
            }
            else {
                arr[k] = nums[right] * nums[right];
                k--;
                right--;
            }
        }
        return arr;
    }
}

// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i = 0; i < nums.length; i++) {
//             nums[i] = nums[i] * nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }