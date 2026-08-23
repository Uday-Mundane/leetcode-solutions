/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] part1 = Arrays.copyOfRange(nums, 0, nums.length - k);
        int[] part2 = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(part2, 0, nums, 0, part2.length);
        System.arraycopy(part1, 0, nums, part2.length, part1.length);
    }
}
// @lc code=end

