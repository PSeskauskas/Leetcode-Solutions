class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> intMap = new HashMap<>();
        /* Map each element of the array with the count being updated with each iteration, once the current value's count reaches a value higher than 
        half the size of the array, return that value */
        for(int i = 0; i < nums.length; i++) {
            intMap.put(nums[i], intMap.getOrDefault(nums[i], 0) + 1);
            if(intMap.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
