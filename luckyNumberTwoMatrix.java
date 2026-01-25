import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class luckyNumberTwoMatrix {
    class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int []rowMin = new int[m];
        int []columnMax = new int[n];

        Arrays.fill(rowMin, Integer.MAX_VALUE);
        Arrays.fill(columnMax, Integer.MIN_VALUE);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                columnMax[j] = Math.max(columnMax[j], matrix[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j]==rowMin[i] && matrix[i][j]==columnMax[j]){
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
        
    }
}
}
