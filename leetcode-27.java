class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length - count; i++) {
            if(nums[i] == val) {
                shift(nums, i);
                count++;
                i--;
            }
        }
        return nums.length - count;
    }
    public static void shift(int[] nums, int index) {
        for(int i = index; i < nums.length - 1; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }
}
