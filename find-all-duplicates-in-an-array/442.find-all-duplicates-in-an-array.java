/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int x : nums) {
            if(nums[Math.abs(x)-1] < 0) {
                list.add(Math.abs(x));
            }
            nums[Math.abs(x)-1] = -nums[Math.abs(x)-1];
        }
        return list;
    }
}
// @lc code=end

