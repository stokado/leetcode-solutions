package edu.nazarov.binary_search;

public class Solution_74_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length - 1;

        int w = matrix[0].length - 1;
        boolean result = false;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (target < matrix[mid][0]) {
                r = mid - 1;
            } else if (target > matrix[mid][w]) {
                l = mid + 1;
            } else {
                result = binarySearch(matrix[mid], target);
                break;
            }
        }

        return result;
    }

    private boolean binarySearch(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return false;
    }
}
