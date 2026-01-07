public class missing{
     int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
        long ExpectedSum = n*(n+1)/2; // n*(n+1)/2 because inclusive n
        long actual = 0;
        
        for(int i = 0; i < arr.length; i++){
            actual = actual + arr[i]; 
        }
        
        return (int)(ExpectedSum - actual);
    }
    
}