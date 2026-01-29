import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> list = new ArrayList<>();

        int startRow = 0;
        int endRow = n-1;

        int startColumn = 0;
        int endColumn = m -1;
        while(startRow<=endRow && startColumn<= endColumn){

        for(int i = startColumn; i <= endColumn; i++){
            list.add(matrix[startRow][i]);
        }
        startRow++;

        for(int i = startRow; i <= endRow; i++){
            list.add(matrix[i][endColumn]);
        }
        endColumn--;

        if(startRow<=endRow){

        
        
        for(int i = endColumn; i>= startColumn; i--){
            list.add(matrix[endRow][i]);
        }
        }
        endRow--;

        if(startColumn<=endColumn){

        

        for(int i = endRow; i>= startRow; i--){
            list.add(matrix[i][startColumn]);
        }
        }
        startColumn++;

        }

        return list;

        

        
    }

}
