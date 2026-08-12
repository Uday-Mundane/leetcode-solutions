/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        int k =0;
        for(int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++) {
                if(nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                expectedNums[k] = nums[i];
                k++;
            }
        }
        for(int i = 0; i < k; i++) {
            nums[i] = expectedNums[i];
        }
        return k;
    }
}

// @lc code=end

