/*
  Power Of Two
  EASY

  Given an integer, write a function to determine if it is a power of two.

  Example 1:

  Input: 1
  Output: true
  Explanation: 20 = 1
  Example 2:

  Input: 16
  Output: true
  Explanation: 24 = 16
  Example 3:

  Input: 218
  Output: false
*/

public class PowerOfTwo {

  public static boolean crazySolution(int n){
    return (n & (n - 1)) == 0;
  }

  public static boolean solution(int n){
    long i = 1;
    while(i < n){
      i *= 2;
    }
    return i == n;
  }

  public static void main(String[] args){
    if(args.length == 0){
      throw new IllegalArgumentException("Pass a number as first argument to evaluate");
    }
    int n = Integer.parseInt(args[0]);
    boolean res = solution(n);
    System.out.println(res);
  }

}
