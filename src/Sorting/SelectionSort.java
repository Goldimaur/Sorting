package Sorting;/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 27-05-2021
 *   Time: 21:06
 *   File: Sorting.Sorting.SelectionSort.java
 */

public class SelectionSort {
    public static void sort(Comparable[] table) {
        int n = table.length;
        for (int fill = 0; fill < n-1; fill++){
            int posMin = fill;
            for (int next = fill + 1; next < n; next++) {
                if (table[next].compareTo(table[posMin]) < 0) {
                    posMin = next;
                }
            }
            Comparable temp = table[fill];
            table[fill] = table[posMin];
            table[posMin] = temp;

        }
    }
}