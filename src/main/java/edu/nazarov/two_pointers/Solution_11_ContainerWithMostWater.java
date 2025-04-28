package edu.nazarov.two_pointers;

/*
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
 */
public class Solution_11_ContainerWithMostWater {
    /*
    Use two pointers to calculate the area of a box

    We try to be greedy here if the highest lines are on the edges, then we will have a maximum area (mis height and max width)

    But we still need to try other combinations because there might be higher lines

    Time: O(n)
    Space: O(1)
     */
    public int maxArea(int[] height) {
        int result = 0;

        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);

            result = Math.max(result, w * h);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
