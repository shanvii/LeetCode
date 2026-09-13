// class Solution {
//     public void sortColors(int[] nums) {
//         int c0 = 0, c1 = 0, c2 = 0;
//         for(int i: nums) {
//             if(i == 0)  c0++;
//             if(i == 1) c1++;
//             if(i == 2) c2++;
//         }
//         for(int i = 0; i < c0; i++)
//             nums[i] = 0;
//         for(int i = c0; i < c0+c1; i++)
//             nums[i] = 1;
//         for(int i = c0+c1; i < nums.length; i++)
//             nums[i] = 2;
//     }
// }

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
                mid++;
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}