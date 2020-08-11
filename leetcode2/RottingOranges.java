/**
    In a given grid, each cell can have one of three values:

    the value 0 representing an empty cell;
    the value 1 representing a fresh orange;
    the value 2 representing a rotten orange.
    Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.

    Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1 instead.

    Example 1:
    Input: [[2,1,1],[1,1,0],[0,1,1]]
    Output: 4

    Example 2:
    Input: [[2,1,1],[0,1,1],[1,0,1]]
    Output: -1
    Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.

    Example 3:
    Input: [[0,2]]
    Output: 0
    Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.

    NOTES
     - You can improve the runtime by a few ms when you remove every processed orange from rotten set.
        At the end of the for (String s: rotten) loop, you can remove this string from rotten, as it 
        would just process the same orange again. And we already know the result.
     - try to implement this somehow with Set<int[]> instead of Set<String> as a challenge
 */


import java.util.Set;
import java.util.HashSet;

public class RottingOranges {

    public static int orangesRotting(int[][] grid){
        // make two hashsets, one that contains string converted coordinates of the rotten oranges
        // the other that contains the string converted coordinates of the fresh oranges
        Set<String> fresh = new HashSet<>();
        Set<String> rotten = new HashSet<>();
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == 1) {
                    fresh.add("" + i + j);
                } else if (grid[i][j] == 2) { 
                    rotten.add("" + i + j);
                }
            }
        }

        // keep track of the number of minutes elapsed
        int minutes = 0;
        // create directions array to ease BFS traversal
        int[][] directions = { {0, 1}, {0, -1}, {-1, 0}, {1, 0} };

        // while the size of the fresh set is more than 0, do the following
        while (fresh.size() > 0) {
            // create a new hashset containing the coordinates of the newly rotting oranges
            Set<String> newlyRotten = new HashSet<>();
            // for every pair of coordinates in the rotten set,
            for (String orange : rotten){
                int i = orange.charAt(0) - '0';
                int j = orange.charAt(1) - '0';
                for (int[] direction : directions) {
                    int nextI = i + direction[0];
                    int nextJ = j + direction[1];
                    if (fresh.contains("" + nextI + nextJ)) {
                        fresh.remove("" + nextI + nextJ);
                        newlyRotten.add("" + nextI + nextJ);
                    }
                }
            }

            if(newlyRotten.size() == 0) return -1;

            rotten = newlyRotten;
            minutes++;
        }
            
         // return minutes
        return minutes;
    }

    public static void main(String[] args){
        int[][] grid = {
            {2, 1, 1},  
            {1, 1, 0},  
            {0, 1, 1}
        }; 
        int minutes = orangesRotting(grid);
        System.out.println(minutes);
    }

}