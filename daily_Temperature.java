import java.util.Stack;

public class daily_Temperature {
    
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && temperatures[st.peek()]< temperatures[i]){
                int previousDayIndex = st.pop();
                result[previousDayIndex] = i - previousDayIndex;
            }

           

            st.push(i);
        }

        return result;
    }

}
