class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length;
        for(int i = 0; i < nums.length; i++)   {
            sum += i - nums[i];
        }
        return sum;
    }
}

// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int a = 0;
//         for(int i = 0; i < nums.length; i++)    {
//             if(nums[i] != a)
//                 return a;
//             a++;
//         }
//         return a;
//     }
// }