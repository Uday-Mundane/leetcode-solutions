/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int[] array = addOne(digits);
        return array;
    }
    public static int[] addOne(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!isNine(arr[i])) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] arr2 = new int[arr.length + 1];
        arr2[0] = 1;
        return arr2;
    }

    public static boolean isNine(int num) {
        if(num == 9) {
            return true;
        } else {
            return false;
        }
    }
}
// @lc code=end
// @lc code=end

