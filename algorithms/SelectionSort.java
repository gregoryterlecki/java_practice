/*
  SELECTION SORT

  What is it?
  Selection sort is an interative sorting algorithm.

  How does it work?
  Works by finding the smallest element in the unsorted portion of the array and
  swapping it into the end of the sorted portion of the array.

  Performance:
  O(n^2) for best, worst and average case. Not an efficient algorithm.
  O(n) space complexity.
*/

import java.util.Arrays;

public class SelectionSort {

  private static int[] selectionSort(int[] arr){
    int n = arr.length;
    if(n == 0 || n == 1) return arr;
    int sorted = 0;
    int smallest;
    for(int i = 0; i < n; i++){
      smallest = sorted;
      for(int j = i; j < n; j++){
        if(arr[j] < arr[sorted]){
          smallest = j;
        }
      }
      swap(arr, smallest, sorted++);
    }
    return arr;
  }

  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args){
    int[] nums = {17, 2, 95, 35, 24, 15, 75, 25, 89, 51};
    int[] sorted = selectionSort(nums);

    // Testing
    Arrays.sort(nums);
    for(int num : sorted){
      System.out.print(Integer.toString(num) + ", ");
    }
    System.out.println("");
    for(int num : nums){
      System.out.print(Integer.toString(num) + ", ");
    }
    System.out.println("");

    System.out.println(Arrays.equals(nums, sorted) ? "Passed" : "Failed");

  }

}
