package edu.nazarov.two_pointers;

/*
Get a union of two ordered arrays

a = [1,2,4,6,6,8,91]
b = [1,5,6,10]
union(a,b) - [1,1,2,4,5,6,6,6,8,10,91]
 */
public class YaUnionOrderedListsSolution {
    public int[] unionLists(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] result = new int[n + m];

        int indexA = 0;
        int indexB = 0;

        for (int resultIndex = 0; indexA < n || indexB < m; ++resultIndex) {
            if (indexA < n && indexB < m) {
                if (a[indexA] < b[indexB]) {
                    result[resultIndex] = a[indexA++];
                } else {
                    result[resultIndex] = b[indexB++];
                }
            } else if (indexA < n) {
                result[resultIndex] = a[indexA++];
            } else {
                result[resultIndex] = b[indexB++];
            }
        }
        return result;
    }
}
