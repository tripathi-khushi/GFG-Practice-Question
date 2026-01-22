import java.util.*;
public class selectionSort {
    public static void sort(int []arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int min = arr[i];
            for(int j = i+1; j < n; j++){
                if(min > arr[j]){
                    int temp = arr[j];
                    arr[j] = min;
                    min = temp;
                }
            }

            arr[i] = min;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            
        }
        
        sort(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+"");
        }


    }
}
