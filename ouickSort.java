public class ouickSort {
    
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        int pivot = arr[low];
        int i = low;
        for(int j = low + 1; j <= high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        
        swap(arr,low,i);
        
        return i;
        
        // code here
    }
    
    void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

