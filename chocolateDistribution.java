public class chocolateDistribution {
    // User function Template for Java


    public int findMinDiff(ArrayList<Integer> arr, int m) {
        if(arr==null || m==0){
            return 0;
        }
        
        if(m>arr.size()){
            return -1;
        }
        // your code here
        Collections.sort(arr);
        int i = 0; 
        int j = i + (m-1);
        
        int ans = Integer.MAX_VALUE;
        
        while(j<arr.size()){
            
            ans = Math.min(ans, arr.get(j) - arr.get(i));
            j++;
            i++;
            
        }
        return ans;
    }

}
