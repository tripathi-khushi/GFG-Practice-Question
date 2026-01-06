public class maxCircularSum {
     public int maxCircularrSum(int arr[]) {
        // code here
        int totalSum = 0;
        int maxEnding = arr[0];
        int maxSoFar = arr[0];
        int minEnding = arr[0];
        int minSoFar = arr[0];
        totalSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            maxEnding = Math.max(curr, maxEnding+curr);
            maxSoFar = Math.max(maxSoFar, maxEnding);
            
            minEnding = Math.min(curr, minEnding+curr);
            minSoFar = Math.min(minSoFar, minEnding);
            
            totalSum += curr;
            
        }
        
        if(maxSoFar<0){
            return maxSoFar;
        }
        
        return Math.max(maxSoFar, totalSum - minSoFar);
        
    }
}
