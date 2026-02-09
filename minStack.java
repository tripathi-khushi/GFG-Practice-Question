import java.util.Stack;


    class Node{
    int value;
    int minValue;
    Node(int value, int minValue){
        this.value = value;
        this.minValue = minValue;
    }
}
class MinStack {
     private Stack<Node> stack ;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new Node(val,val));
        }else{
            int currentMin = stack.peek().minValue;
            stack.push(new Node(val,Math.min(val,currentMin)));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
        
    }
    
    public int top() {

       return stack.peek().value;
        
    }
    
    public int getMin() {
       return stack.peek().minValue;
    }
}



