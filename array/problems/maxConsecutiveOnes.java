package problems;

class Solution {
    /*
     * 485. Max Consecutive Ones
     * Given a binary array nums (nums[i] is either 0 or 1), return the maximum number of consecutive 1's in the array.
     * 
     * Example: 
     * Input: nums = [1, 1, 0, 1, 1, 1]
     * Output: 3
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
                max = counter > max ? counter : max;
            } else if (nums[i] == 0) {
                counter = 0;
            }
        }

        return max;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
}