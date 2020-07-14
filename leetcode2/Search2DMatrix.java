/*
    Search 2D Matrix

    Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

    Integers in each row are sorted in ascending from left to right.
    Integers in each column are sorted in ascending from top to bottom.
    Example:

    Consider the following matrix:

    [
        [1,   4,  7, 11, 15],
        [2,   5,  8, 12, 19],
        [3,   6,  9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]
    ]

    Given target = 5, return true.
    Given target = 20, return false.

    Solution approach: 
    Start in either the top right corner, or the bottom left.
    Obviously, if your current number is equal to the target, return true.
    If the current number is less than the target, move to the next row. 
    There's no way your target is located in that row, since you started looking at the highest number in that row.
    else, your target is equal or less than your current number. It may be in your row, so move one column to the left.
*/

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = m - 1;
        while(i < n && j >= 0) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        return false;
    }
    
    public static void main(String[] args){
        int[][] matrix  = {};
        int target = 3;
        boolean result = searchMatrix(matrix, target);
        System.out.println("Found: " + result);
    }

}