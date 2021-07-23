class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        /* Add each element in the array into the HashMap as a key */
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], 0);
        }
        int i = 1;
        /* Look through the HashMap and return the first key that isn't found in the HashMap */
        while(true) {
            if(!map.containsKey(i)) {
                return i;
            }
            else {
                i++;
            }
        }
    }
}
