class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else
                i++;
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++)
            if (nums[index] != index + 1)
                ans.add(index + 1);

        return ans;
    }
}

// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();

//         for(int n: nums)
//             set.add(n);

//         for(int i = 1; i <= nums.length; i++)    {
//             if(!set.contains(i))
//                 list.add(i);
//         }
//         return list;
//     }
// }