class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int first = m - 1;
        int second = n - 1;
        /* Iterate through the arrays backwards, comparing elements from both arrays and placing the highest value in the ith index of the first int array */
        while(second >= 0) {
            if(first < 0 || nums2[second] > nums1[first]) {
                nums1[i] = nums2[second];
                second--;
            }
            else {
                nums1[i] = nums1[first];
                first--;
            }
            i--;
        }
    }
}
