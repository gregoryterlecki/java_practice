/*
  Single Number
  EASY

  Given a non-empty array of integers, every element appears twice except for one. Find that single one.

  Note:

  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

  Example 1:

  Input: [2,2,1]
  Output: 1
  Example 2:

  Input: [4,1,2,1,2]
  Output: 4
*/
public class SingleNumber {

  public static int solution(int[] nums){
    HashSet<Integer> set = new HashSet<Integer>();
    for(int num : nums){
      if(!set.contains(num)){
        set.add(num);
      } else {
        set.remove(num);
      }
    }
    for(int i : set){
      return i;
    }
    return -1;
  }

  public static void main(String[] args){
    if(args.length == 0){
      throw new IllegalArgumentException("Pass a number as first argument to evaluate");
    }
    String s = args[0];
    // int index = solution(s);
    System.out.println(s);
  }

}
