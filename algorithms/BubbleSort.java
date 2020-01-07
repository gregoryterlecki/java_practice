/*
  BUBBLESORT

  What is it?
  Bubblesort is a sorting algorithm where for each iteration over the
  unsorted collection, the highest number in the unsorted portion of the
  collection will 'bubble' to the right.

  How does it work?
  We iterate over the collection, while maintaining two indices that are
  adjacent to each other. As we scan through, the pair of pointers advances
  rightwards until the right pointer reaches the end of the unsorted part of
  the collection.
  Every time the number pointed at by the right pointer is less than the
  one on the left, we swap the values. Then we scan again, except going
  one step less than the round before, since the highest number scanned will
  be in the rightmost position. We repeat until sorted.

  Performance:
  Unoptimized:
  Worst case: O(n^2)
  Average case: O(n^2)
  Best case: O(n)

  Optimized:
  Worst case:
  Average case:
  Best case: 

  link: https://www.youtube.com/watch?v=6Gv8vg0kcHc

*/

import java.util.Arrays;

public class BubbleSort {

  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  private static int[] sort_unoptimized(int[] input) {
    int[] arr = input.clone();
    boolean sorted = false;
    while(!sorted){
      sorted = true;
      for(int i = 0; i < arr.length - 1; i++){
        if(arr[i] > arr[i + 1]){
          swap(arr, i, i+1);
          sorted = false;
        }
      }
    }
    return arr;
  }

  private static int[] sort_optimized(int[] input) {
    int[] arr = input.clone();
    boolean sorted = false;
    int lastSortedIndex = arr.length - 1;
    while(!sorted){
      sorted = true;
      for(int i = 0; i < lastSortedIndex; i++){
        if(arr[i] > arr[i + 1]){
          swap(arr, i, i+1);
          sorted = false;
        }
      }
      lastSortedIndex--;
    }
    return arr;
  }

  public static void main(String[] args){

    int[] nums = {12, 5, 9, 4, 13, 2, 8, 11};
    int[] sorted = sort_optimized(nums);

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
