import java.util.Stack;

public class asteroids {
     public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack = new Stack<>();
       for(int i = 0; i < asteroids.length; i++){
        Boolean alive = true;
        while(!stack.isEmpty() && asteroids[i] < 0 && stack.peek() >0){
            int sum = 0;
            sum = stack.peek() + asteroids[i];
            if(sum<0){
                stack.pop();
                continue;

            }
            else if(sum==0){
                stack.pop();
                alive = false;
                break;
            }
            else{
                alive = false;
                break;
            }
            
        }

        if(alive){
            stack.push(asteroids[i]);
        }
       } 

       int[] result = new int[stack.size()];
  
    for (int i = stack.size() - 1; i >= 0; i--) {
       result[i] = stack.pop();
     }

     return result;

    }

}
