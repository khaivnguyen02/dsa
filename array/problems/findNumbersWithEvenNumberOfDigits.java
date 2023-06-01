package problems;

class Solution {
    /*
     * Find Numbers with Even Number of Digits
     * 
     * Given an array nums of integers, return how many of them contain an even number of digits.
     * 
     * Example:
     * Input: nums = [12, 345, 2, 6, 7896]
     * Output: 2
     * 
     * Hint: Divide the number by 10 again and again until x = 0 to get the number of digits.
     */
    public int findNumbers(int[] nums) {
        int counter = 0;
        int size;

        for (int num: nums) {
            size = 0;

            while (num > 0) {
                size++;
                num /= 10;
            }

            if (size % 2 == 0) {
                counter++;
            }
        }

        return counter;

        // Time Complexity: 
        // Space Complexity: O(1)
    }
}