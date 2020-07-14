/*
  First Unique Character In A String
  EASY

  Given a string, find the first non-repeating character in it and return it's
  index. If it doesn't exist, return -1.

  Examples:
  s = "leetcode"
  return 0.

  s = "loveleetcode",
  return 2.
  Note: You may assume the string contain only lowercase letters.

  Hint: the approach
  Scan through the characters of the string.
  Using a hashmap, invalidate duplicate characters as the string is iterated on.
  This can be done by checking at each character whether the hashmap has that key.
    If not, add that key with the index as the value.
    Otherwise, the character has been seen before. At that key, put a -1 to invalidate that character.
  After this, re iterate over the array and checking for whether that character is a -1 in your hashmap.
    As soon as you find that one of them is not -1, return that index.
*/

import java.util.HashMap;

public class FirstUniqueCharacterInAString {

  public static int solution(String s){

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i = 0; i < s.length(); i++){
      if(!map.containsKey(s.charAt(i))){
        map.put(s.charAt(i), i);
      } else {
        map.put(s.charAt(i), -1);
      }
    }
    for(int i = 0; i < s.length(); i++){
      if(map.get(s.charAt(i)) != -1){
        return i;
      }
    }
    return -1;

  }

  public static void main(String[] args){
    if(args.length == 0){
      throw new IllegalArgumentException("Pass a string as first argument to evaluate");
    }
    String s = args[0];
    int index = solution(s);
    System.out.println(index);
  }
}
