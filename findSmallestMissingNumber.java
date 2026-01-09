public class findSmallestMissingNumber {
      public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;

        
        while (i < n) {
            int correctIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
               
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
