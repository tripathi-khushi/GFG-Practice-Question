public class UniqueNumber {
    public int findUnique(int[] arr) {
        // code here
        // using bit manipulation
        int n = arr.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            res = res ^ arr[i];
        }
        
        return res;
    }
}
