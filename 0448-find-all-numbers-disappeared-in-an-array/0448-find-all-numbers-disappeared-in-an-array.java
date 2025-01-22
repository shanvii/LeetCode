class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length)  {
            int corr = nums[i] - 1;
            if(nums[corr] != nums[i])   {
                int temp = nums[i];
                nums[i] = nums[corr];
                nums[corr] = temp;
            }   else    i++;
        }

        List<Integer> list = new ArrayList<>();
        for(i = 0; i < nums.length; i++)    {
            if(nums[i] != i+1)  list.add(i+1);
        }
        return list;
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