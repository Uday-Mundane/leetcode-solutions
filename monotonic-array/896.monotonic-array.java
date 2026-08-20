/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if(nums[i] <= nums[j]) {
                count1++;
            }
        }
        for(int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if(nums[i] >= nums[j]) {
                count2++;
            }
        }
        if(count1 == nums.length - 1 || count2 == nums.length - 1) {
            return true;
        }
        else {
            return false;
        }

    }
}
// @lc code=end

