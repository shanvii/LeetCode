class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)    return nums[0];
        if(nums[0] != nums[1])  return nums[0];
        if(nums[nums.length-1] != nums[nums.length-2])  return nums[nums.length-1];

        //Your solution must run in O(log n) time and O(1) space. - binary!!
        for(int i = 0; i < nums.length-1; i+=2) {
            if(nums[i] != nums[i+1])
                return nums[i];
        }


        return -1;
    }
}