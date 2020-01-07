/*
  IS PALINDROME
*/

public class IsPalindrome {

  // remember the rules with the problem: negative values arent palindromes,
  // and neither are numbers that end in 0
  public static boolean mySolutionRevised(int x) {
    if(x < 0 || x % 10 == 0 && x !=0) return false;
    int rev = 0;
    while(x > rev){
      rev = rev * 10 + x % 10;
      x /= 10;
    }
    return (rev == x || rev / 10 == x);
  }

  public static boolean mySolution(int x) {
    int copy = x;
    int rev = 0;
    int pop;
    while(copy > 0){
      pop = copy % 10;
      copy /= 10;
      rev = rev * 10 + pop;
    }
    return (rev == x);
  }

  public static boolean theirSolution(int x){
    // Special cases:
    // As discussed above, when x < 0, x is not a palindrome.
    // Also if the last digit of the number is 0, in order to be a palindrome,
    // the first digit of the number also needs to be 0.
    // Only 0 satisfy this property.
    if(x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    int revertedNumber = 0;
    while(x > revertedNumber) {
      revertedNumber = revertedNumber * 10 + x % 10;
      x /= 10;
    }

    // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
    // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
    // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
    return x == revertedNumber || x == revertedNumber/10;
  }

  public static void main(String[] args){
    int pal = 123454321;
    System.out.println(theirSolution(pal));
  }

}
