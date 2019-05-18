package exercise.exercise_0518;

import java.util.Arrays;

public class TestSoltion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][]arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][]arr2 = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] tmp = solution.merge(arr2);
        for(int i=0; i<tmp.length; i++){
            for(int j=0; j<tmp[0].length; j++){
                System.out.print(tmp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
