java.util.Stack;
public class postFixEvaluation {
    import java.util.Stack;

    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> stack =  new Stack<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            String s = arr[i];
            
    if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/") || s.equals("^")){
                int op2 = stack.pop();
                int op1 = stack.pop();
                
                if(s.equals("+")){
                    stack.push(op1+op2);
                }
                
                else if(s.equals("-")){
                    stack.push(op1-op2);
                }
                else if(s.equals("*")){
                    stack.push(op1*op2);
                }
                else if(s.equals("/")){
                    stack.push((int)Math.floorDiv(op1,op2));
                }
                else if(s.equals("^")){
                    stack.push((int)Math.pow(op1,op2));
                }
            }
            
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        
        return stack.pop();
    }

}
