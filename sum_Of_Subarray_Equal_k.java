import java.util.HashMap;

public class sum_Of_Subarray_Equal_k {
    
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int currentSum = 0;
        int count = 0;
        for(int num : nums){
            currentSum = currentSum + num;

            if(map.containsKey(currentSum - k)){

                count = count + map.get(currentSum-k);

            }

            map.put(currentSum, map.getOrDefault(currentSum,0)+1);

        }

        return count;
        
    }

}
