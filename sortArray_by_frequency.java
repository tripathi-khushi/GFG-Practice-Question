import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class sortArray_by_frequency {
    
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            result.add(nums[i]);
        }

        Collections.sort(result,(a,b)->{
            int freqA = map.get(a);
            int freqB = map.get(b);
            if(freqA!=freqB){
                return freqA - freqB;
            }
            else{
                return b-a;
            }
        });

        int[] finalArray = new int[nums.length];
        for(int i = 0; i< result.size(); i++){
            finalArray[i] = result.get(i);
        }

        return finalArray;
        
    }

}
