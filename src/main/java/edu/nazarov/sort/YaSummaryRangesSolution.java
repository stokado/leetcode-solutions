package edu.nazarov.sort;

/*
Дан список целых чисел, повторяющихся элементов в списке нет.
Нужно преобразовать это множество в строку, сворачивая соседние по числовому ряду числа в диапазоны.
Примеры:
[1,4,5,2,3,9,8,11,0] => "0-5,8-9,11"
[1,4,3,2] => "1-4"
[1,4] => "1,4"

Time: O(nlog(n)) (quick sort) -> O(n) (count sort, for smaller values)
Space: O(1)
 */
public class YaSummaryRangesSolution {
    public String summaryRanges(int[] nums) {
//        Arrays.sort(nums); // n log (n)
        countSort(nums); //

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            int end = nums[i];

            if (!result.isEmpty()) {
                result.append(',');
            }
            result.append(start);
            if (end != start) {
                result.append('-').append(end);
            }
        }

        return result.toString();
    }

    private void countSort(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int range = max - min + 1;

        int[] counts = new int[range];
        for (int num : nums) {
            counts[num - min]++;
        }

        for (int i = 0, res = 0; i < range; ++i) {
            while (counts[i] > 0) {
                nums[res++] = i + min;
                counts[i]--;
            }
        }
    }
}
