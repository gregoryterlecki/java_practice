/*
  MERGESORT

  What is it?
  Merge sort is a sorting algorithm that works by

  How does it work?
  

  Performance:


*/

import java.util.Arrays;

public class MergeSort {

  public static int[] merge(int[] l, int[] r) {
    int[] c = new int[l.length + r.length];
    int li = 0, ri = 0;
    for (int k = 0; k < c.length; k++) {
      if      (li >= l.length) c[k] = r[ri++];
      else if (ri >= r.length) c[k] = l[li++];
      else if (l[li] <= r[ri]) c[k] = l[li++];
      else                     c[k] = r[ri++];
    }
    return c;
  }

  public static int[] mergeSort(int[] a){
    int n = a.length;

    if(n==0 || n==1){
      return a;
    }
    int[] left = Arrays.copyOfRange(a, 0, n/2);
    int[] right = Arrays.copyOfRange(a, n/2, n);
    left = mergeSort(left);
    right = mergeSort(right);

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
