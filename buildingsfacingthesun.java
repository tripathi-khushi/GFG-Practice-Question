public class buildingsfacingthesun {
      public static int longest(int arr[]) {
        // write code here
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            while(!stack.isEmpty() && stack.peek()<= arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                count++;
            }
            
            stack.push(arr[i]);
        }
        
        return count;
    }
}
