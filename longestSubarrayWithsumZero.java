public class longestSubarrayWithsumZero {
    
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
            int prefixSum = 0;
            int res = 0;
            for(int i = 0; i < arr.length; i++){
                prefixSum = prefixSum + arr[i];
                
                if(prefixSum == 0){
                    res = i + 1;
                }
                
                else if(map.containsKey(prefixSum - 0)){
                    res = Math.max(res, i - map.get(prefixSum-0));
                }
                
                if(!map.containsKey(prefixSum)){
                    map.put(prefixSum, i);
                }
            }
            
            return res;
        
    }

}
