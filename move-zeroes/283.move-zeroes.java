/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == 0 && i < nums.length - 1) {
                for(int j = i; j < nums.length - 1; j++) {
                    // int temp = nums[j];
                    // nums[j] = nums[j+1];
                    // nums[j+1] = temp;

                    nums[j] = nums[j] + nums[j+1];
                    nums[j+1] = nums[j] - nums[j+1];
                    nums[j] = nums[j] - nums[j+1];
                }
            } else {
                continue;
            }
        }
    }
}
// @lc code=end

