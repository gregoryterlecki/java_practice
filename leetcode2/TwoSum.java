/**
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
 */

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        // create new HashMap<Integer, Integer>
        HashMap<Integer, Integer> map = new HashMap<>();
        // loop over nums, filling the hashmap
        for (int i = 0; i < nums.length; i++) 
            map.put(nums[i], i);
        
        int expected;
        // loop over nums again.
        for (int i = 0; i < nums.length; i++) {
            // create the number you expect to find, then look for it in the hashmap.
            expected = target - nums[i];
            // if the entry exists, and it's index is not the current index, 
            // go ahead and return that sum' bitch
            if (map.containsKey(expected) && map.get(expected) != i) {
                return new int[]{i, map.get(expected)};
            }
        }
        // if the loop does not return anything, throw big exception, such as IllegalArgumentException  
        throw new IllegalArgumentException("No two sum found");
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println("" + ans[0] + " " + ans[1]);
    }

}