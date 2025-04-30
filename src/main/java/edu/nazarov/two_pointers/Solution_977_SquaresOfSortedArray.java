package edu.nazarov.two_pointers;

public class Solution_977_SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int resIndex = right;
        int[] result = new int[nums.length];

        while (left <= right) {
            int leftNum = Math.abs(nums[left]);
            int rightNum = Math.abs(nums[right]);

            if (leftNum > rightNum) {
                result[resIndex] = leftNum * leftNum;
                left++;
            } else {
                result[resIndex] = rightNum * rightNum;
                right--;
            }
            resIndex--;
        }

        return result;
    }
}
