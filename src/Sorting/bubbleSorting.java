package Sorting;/*   Created by IntelliJ IDEA.
 *   Author: Goldi Maurya
 *   Date: 24-05-2021
 *   Time: 13:33
 *   File: BubbleSort.java
 */

import java.util.Arrays;

public class bubbleSorting {
    public static void main(String[] args) {
        int[] arr = { 12,8,16,5,2};
        bubbleSorting bubbleSortObject = new bubbleSorting();
        bubbleSortObject.bubbleSort(arr);
        System.out.println("final sorted ==> "+ Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        int count =0;
        for(int i = 0;i< arr.length ;i++){
            for(int j =0;j<arr.length -1 ;j++){
                if(arr[j] >arr[j+1] ){
                    System.out.println("Swapping -->" + arr[j] + "and --> " +arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}