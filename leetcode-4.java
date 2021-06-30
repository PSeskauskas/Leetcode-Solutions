class Solution {
    /* Merge the two arrays together iteratively and then return the median depending on if the length of the new array is even or not */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1, nums2);
        if(merged.length == 0) {
            return 0;
        } else if(merged.length == 1) {
            return merged[0] * 1.0;
        } else if(merged.length % 2 == 1) {
            return merged[merged.length / 2] * 1.0;
        } else {
            return (merged[(merged.length / 2) - 1] + merged[merged.length / 2]) / 2.0;
        }
    }
    /* Merge the two arrays together iteratively */
    public static int[] merge(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
                k++;
            } else if(nums1[i] > nums2[j]) {
                merged[k] = nums2[j];
                j++;
                k++;
            } else {
                merged[k] = nums1[i];
                merged[k + 1] = nums2[j];
                k += 2;
                i++;
                j++;
            }
        }
        if(i < nums1.length) {
            while(i < nums1.length) {
                merged[k] = nums1[i];
                i++;
                k++;
            }
        }
        else if(j < nums2.length) {
            while(j < nums2.length) {
                merged[k] = nums2[j];
                j++;
                k++;
            }
        }
        return merged;
    }
}
