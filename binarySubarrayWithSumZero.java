public class binarySubarrayWithSumZero {
    
    public int numSubarraysWithSum(int[] arr, int target) {
       
        return atMost(arr, target) - atMost(arr, target - 1);
    }
    public int atMost(int[] arr, int target) {
       
       
        if (target < 0) return 0;

        int left = 0;
        int currentSum = 0;
        int count = 0;

       
        for (int right = 0; right < arr.length; right++) {
            currentSum += arr[right];

           
            while (currentSum > target) {
                currentSum -= arr[left];
                left++;
            }

         
            count += (right - left + 1);
        }
        
        return count;
        
        
        
    }

}
