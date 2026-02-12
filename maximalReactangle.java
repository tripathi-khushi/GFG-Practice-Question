import java.util.Stack;

public class maximalReactangle {
    
    public int maximalRectangle(char[][] matrix) {
        
        int  n = matrix.length;
        int m = matrix[0].length;
        int[] height = new int[m];
        int area = 0;


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j]=='1'){
                    height[j]++ ;
                }
                else{
                    height[j]=0;

                }
            }

            area = Math.max(area, largestRectangle(height));
        }

        return area;


        
    }

    public int largestRectangle(int[] arr){
        
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] pse = new int[n];
        for(int i = 0; i < n; i++ ){
            while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();
         int[] nse = new int[n];
        for(int i = n-1; i >= 0; i-- ){
            while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nse[i] = n;
            }
            else{
                nse[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;

        for(int i = 0; i <n; i++){
            int width = nse[i] - pse[i] - 1;
            int area = arr[i]*width;

            maxArea = Math.max(area,maxArea);

        }

        return maxArea;




    }
}

