/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int i = 0;
        for(i = 0; i <= l; i++) {
            boolean found = false;
            for(int j = 0; j < l; j++) {
                if(i == nums[j]) {
                    found = true;
                    break;
                }  
            }
            if(found == false) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

