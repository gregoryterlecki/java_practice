/*
  QUICKSORT

  What is it?
  Quicksort is an efficient sorting alghorithm

  How does it work?
  Quicksort is a divide and conquer algorithm, because it works by splitting the
  problem into two smaller arrays, then working to sort those individual arrays
  first.

  The quicksort appraoch:
  On each run of the recursive portion of quicksort, we are given lo and hi as
  parameters. So long as lo is below hi, we divide the array in half using a
  helper method called partition, which picks a random pivot between lo and hi,
  returning the border index. It will also modify the underlying array so that
  all elements between lo and p are smaller than p, and all elements between p
  and hi are larger than p.


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
    // generates a random int between lo and hi inclusively.
    // when you give Random.nextInt() an argument, it spits out a number [0, num).
    // so the +1 is done to make the bounds inclusive on the top end.
    return rand.nextInt((hi - lo) + 1) + lo;
  }

  private static int partition(int[] arr, int lo, int hi){
    // swap items at lo, and random index between low and hi
    swap(arr, lo, getPivot(lo, hi));
    // set the border index at lo + 1
    int border = lo + 1;
    // we iterate from the border index to hi inclusively. We continuously swap items
    // that lower than the item at lo, so that when this is done,
    for(int i = border; i <= hi; i++){
      if(arr[i] < arr[lo]){
        swap(arr, i, border++);
      }
    }
    // swap back the pivot item into the middle of the array. This way, all the
    // items to the left of the pivot are smaller than pivot value, and all the
    // items on the right are bigger than the pivot.
    // * remember to swap with border - 1 and to return border - 1,
    // since the border was incremented during the loop.
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
