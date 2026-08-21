/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
import java.util.TreeSet;
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size() < 3) {
            return set.last();
        }
        int[] arr = new int[set.size()];
        int i =0;
        for(int n : set) {
            arr[i++] = n;
        }
        return arr[set.size() - 3];
    }
}
// @lc code=end

