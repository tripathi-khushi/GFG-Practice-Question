public class nextGreaterElementIII {
     public int nextGreaterElement(int n) {

        int temp = n;
        int length = String.valueOf(n).length();
        int arr[] = new int[length];
        int i = 0;
        for( i = length-1; i>=0; i--){
            arr[i] = temp%10;
            temp = temp/10;
        }
      

         i = arr.length-2;
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }

        if(i<0){
            return -1;
        }

        int j = arr.length-1;
        while(arr[j] <= arr[i]){
            j--;
        }

        swap(arr,i,j);

        reverse(arr, i+1, length-1);

        long result = 0;
        for(int num : arr){
            result = result*10 + num;
        }

       return (result > Integer.MAX_VALUE) ? -1 : (int) result;


        
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[], int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
