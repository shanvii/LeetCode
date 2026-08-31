class Solution {
    public void moveZeroes(int[] nums) {
        // int index = 0;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] != 0) {
        //         nums[index++] = nums[i];
        //     }
        // }
        // while(index < nums.length) {
        //     nums[index++] = 0;
        // }

        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left++] = temp;
            }
        }
    }
}