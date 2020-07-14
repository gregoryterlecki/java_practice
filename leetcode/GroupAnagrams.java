/*

Given an array of strings, group anagrams together.
Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]


Hints:
1. The approach is to create collections that uniquely identify the list of strings
   it contains.
2. On each of the strings in the input parameter, you will want to sort itself
   characters, and check if that is a key in the HashMap.
   If it is not yet a key, add it. Regardless of this, you will be adding the
   current string to the list of strings, which is a value under the given key
   of the hashmap.
  
*/

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {

  public static List<List<String>> groupAnagrams(String[] strs){
    List<List<String>> groupedAnagrams = new ArrayList<>();
    HashMap<String, List<String>> map = new HashMap<>();
    char[] chars;
    String sortedString;
    for(String str : strs){
      chars = str.toCharArray();
      Arrays.sort(chars);
      sortedString = new String(chars);
      if(!map.containsKey(sortedString)){
        map.put(sortedString, new ArrayList<>());
      }
      map.get(sortedString).add(str);
    }

    groupedAnagrams.addAll(map.values());

    return groupedAnagrams;

  }

  public static void main(String[] args){
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> ans = groupAnagrams(strs);
    System.out.println(ans);
  }

}
