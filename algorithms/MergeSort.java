/*
  MERGESORT

  What is it?
  Merge sort is a sorting algorithm that works by

  How does it work?
  Mergesort is a recursive, divide and conquer type sorting algorithm, which
  means we have a recursive case and a base case. The base case says that an array size 1
  is already sorted, so it is returned.
  Otherwise, we enter the recursive case. We:
  1. split array into left and right halves
  2. sort the left and right half
  3. return the merged result of the two sorted arrays.

  Merge is the helper function. This basically takes two sorted arrays, and merges
  them together.

  Performance:
  average and worst case of O(n log n).

*/

import java.util.Arrays;

public class MergeSort {

  public static int[] merge(int[] l, int[] r) {
    // create a new array to return that's length of left plus the length of r
    int[] c = new int[l.length + r.length];
    // create new indices that start at 0, for the left array and the right array
    int li = 0, ri = 0;
    for (int k = 0; k < c.length; k++) {
      if      (li >= l.length) c[k] = r[ri++]; // if left index has already passed the length of left, there are only elements in r to add.
      else if (ri >= r.length) c[k] = l[li++]; // if right index has already passed the length of right, there are only elements in l to add
      else if (l[li] <= r[ri]) c[k] = l[li++]; // if the element pointed at by left index is smaller than the element pointed at by right index, add the left item index
      else                     c[k] = r[ri++]; // otherwise, the element pointed at by right index is smaller than the left index; so the right index item is added
    }
    return c;
  }

  public static int[] mergeSort(int[] a){
    int n = a.length;
    // edge case testing and base case; immediately return lengthless or single length arrays
    if(n==0 || n==1){
      return a;
    }
    // grab the left and right half of the array
    int[] left = Arrays.copyOfRange(a, 0, n/2);
    int[] right = Arrays.copyOfRange(a, n/2, n);
    // sort the left half, sort the right half
    left = mergeSort(left);
    right = mergeSort(right);

    // return the merged result of left and right
    return merge(left, right);
  }

  public static void main(String[] args){

    int[] nums = {12, 5, 9, 4, 13, 2, 8, 11, 3};
    int[] sorted = mergeSort(nums);

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
