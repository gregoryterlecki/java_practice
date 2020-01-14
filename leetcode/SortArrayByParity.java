public class SortArrayByParity {

  public void swap(int[] A, int i, int j){
    int temp = A[j];
    A[j] = A[i];
    A[i] = temp;
  }

  public int[] sortArrayByParity(int[] A) {
    int i = 0;
    int j = A.length -1;
    while(i < j){
      if((A[i] % 2 == 1) && (A[j] % 2 == 0)){
        swap(A, i, j);
        i++; j--;
      }
      else if(A[i] % 2 == 1){
          j--;
      }
      else {
          i++;
      }
    }
    return A;
  }

}
