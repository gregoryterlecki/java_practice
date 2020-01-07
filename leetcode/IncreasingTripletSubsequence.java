public class IncreasingTripletSubsequence {

  private static boolean increasingTriplet(int[] nums) {
    if (nums.length <3) return false;


    int smaller_1 = Integer.MAX_VALUE;
    int smaller_2 = Integer.MAX_VALUE;
    int largest = -1;
    for (int i = 0; i<nums.length;++i) {
      largest = nums[i];
      if (largest <= smaller_1 ) {
        smaller_1 = largest;
      }
      else if (largest <= smaller_2 ) {
        smaller_2 = largest;
      }
      else {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args){
    int[] nums = {5, 1, 5, 5, 2, 5, 4};
    System.out.println(increasingTriplet(nums));
  }
}
