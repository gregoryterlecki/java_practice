/*
  QUICKSORT

  What is it?

  How does it work?

  Performance:
  Worst case is O(n^2)
  Average case is O(n logn)
*/

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

  public static int[] quickSort(int[] inArr){
    int[] arr = inArr.clone();
    return quickSort(arr, 0, arr.length - 1);
  }

  private static int[] quickSort(int[] arr, int lo, int hi){
    if(lo < hi+1){
      int p = partition(arr, lo, hi);
      quickSort(arr, lo, p-1);
      quickSort(arr, p+1, hi);
    }
    return arr;
  }

  private static int getPivot(int lo, int hi){
    Random rand = new Random();
    return rand.nextInt((hi - lo) + 1) + lo;
  }

  private static int partition(int[] arr, int lo, int hi){
    swap(arr, lo, getPivot(lo, hi));
    int border = lo + 1;
    for(int i = border; i <= hi; i++){
      if(arr[i] < arr[lo]){
        swap(arr, i, border++);
      }
    }
    swap(arr, lo, border-1);
    return border - 1;
  }

  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }


  public static void main(String[] args){

    int[] nums = {12, 5, 9, 4, 13, 2, 8, 11};
    int[] sorted = quickSort(nums);

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
