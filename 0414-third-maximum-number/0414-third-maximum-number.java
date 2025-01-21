class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i = nums.length - 1; i > 0; i--)    {
            if(nums[i] != nums[i-1])    count++;
            if(count == 3)  return nums[i - 1];
        }
        return nums[nums.length - 1];
    }
}

// class Solution {
//     public int thirdMax(int[] nums) {
//         Arrays.sort(nums);
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(nums[0]);
//         int a = nums[0];
//         for(int i = 1; i < nums.length; i++)    {
//             if(a == nums[i])    continue;
//             list.add(nums[i]);
//             a = nums[i];
//         }
//         if(list.size() < 3) return list.get(list.size() - 1);
//         return list.get(list.size() - 3);
//     }
// }