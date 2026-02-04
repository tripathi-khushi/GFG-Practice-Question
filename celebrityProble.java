public class celebrityProble {
    
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            stack.push(i);
        }
        
       while(stack.size()>1){
           int a = stack.pop();
           int b = stack.pop();
           
           if(mat[a][b]==0){
               stack.push(a);
           }
           else{
               stack.push(b);
           }
           
           
       }
       
       int celebrity = stack.pop();
       for(int i = 0; i < n; i++){
           if(i!=celebrity && (mat[i][celebrity]== 0 || mat[celebrity][i] == 1)){
               return -1;
           }
       }
       
       return celebrity;
    }

}
