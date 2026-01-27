import java.util.ArrayList;
import java.util.Collections;

public class arrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int maxSoFar = arr[n-1];
        result.add(maxSoFar);
        for(int i = n-2; i >= 0; i--){
            if(arr[i]>maxSoFar){
                maxSoFar = arr[i];
                
                result.add(maxSoFar);
                
            }
            
        }
        
        Collections.reverse(result);
        
        return result;
    }
}
