import java.util.Stack;

public class parenthesisChecker {
    
    public boolean isBalanced(String s) {
        // code here
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(ch== '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                
                char top = stack.peek();
                
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    return false;
                }
                
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}


