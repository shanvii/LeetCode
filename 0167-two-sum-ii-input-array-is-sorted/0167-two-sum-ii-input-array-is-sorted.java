class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])) return new int[] {map.get(numbers[i]) + 1, i + 1};
            else    map.put(target - numbers[i], i);
        }
        return new int[0];
    }
}