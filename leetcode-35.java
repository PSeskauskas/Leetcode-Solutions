class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                index = i; 
                break;
            }
            else if(nums[i] > target) { 
                index = i;
                break;
            }
            else if(nums[i] < target && i < nums.length - 1) {
                continue;
            }
            else {
                index = nums.length;
            }
        }
        return index;
    }
}