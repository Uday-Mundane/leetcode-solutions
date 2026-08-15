/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n -1;
        int k = m + n - 1;
        while(i>=0 && j>=0) { // starting from last because if i start from the start the duplicates will give problem and i will need to then move the complete array ahead by 1 index
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(j >= 0) { // if elements are left in the nums2 this will put them at the start.
            // if elements are left in nums1 then they will already be on the correct place.
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
// @lc code=end

