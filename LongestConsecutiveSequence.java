public class LongestConsecutiveSequence {


    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int val : arr){
            set.add(val);
        }
        
        
        for(int val: arr){
            if(set.contains(val) && !set.contains(val-1)){
                int current = val;
                int count = 0;
                while(set.contains(current)){
                    set.remove(current);
                    current++;
                    count++;
                }
                
                res = Math.max(res,count);
            }
        }
        
        return res;
        
    }

    
}
