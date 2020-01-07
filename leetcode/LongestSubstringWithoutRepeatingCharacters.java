import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

  private static int charCode(String s, int pos){
    return (int)(s.charAt(pos)) - 97;
  }


  /*
    predicated on the idea that, if you have an interval s[i, j), and you want to
    move j + 1 (causing you to see an already seen character), should you iterate i
    and remove items from the list until they're unique again? No, you should just
    reassign i to whichever's greater; itself, or the last index where the letter
    was last seen

    initialize ans as 0, and a new hashMap
    for i = 0 and j = 0, where j < s.length, do the following
      if(map contains the key that is s[j])
        i = max(map.get(s[j]), i)
      ans = max(ans, j - i + 1)
      map.put(s[j], j + 1)
  */

  private static int betterSolution(String s){
    int n = s.length(), ans = 0;
    Map<Character, Integer> map = new HashMap<>(); // current index of character
    // try to extend the range [i, j]
    for (int j = 0, i = 0; j < n; j++) {
      if (map.containsKey(s.charAt(j))) {
        i = Math.max(map.get(s.charAt(j)), i);
      }
      ans = Math.max(ans, j - i + 1);
      map.put(s.charAt(j), j + 1);
    }
    return ans;
  }

  private static int solution(String s) {

    int maxLength = 1;
    int tempMax = 0;
    int startingIndex = 0;
    boolean hasDuplicates;

    int[] charCounter = new int[26];
    Arrays.fill(charCounter, 0);
    while(s.length() - maxLength > startingIndex){

      hasDuplicates = false;

      for(int i = startingIndex; !hasDuplicates && i < s.length(); i++){
        if(charCounter[ charCode(s, i) ] > 0){
          hasDuplicates = true;
        }
        else {
          charCounter[ charCode(s, i) ]++;
          tempMax++;
        }
      }
      if(tempMax > maxLength)
        maxLength = tempMax;

      tempMax = 0;
      startingIndex++;
      Arrays.fill(charCounter, 0);

    }

    return maxLength;

  }

  public static void main(String[] args){

    String s = "nutrition";
    int answer = solution(s);
    System.out.println("Answer for s: " + s + " is " + answer);

  }

}
