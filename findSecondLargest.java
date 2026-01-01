import java.util.*;

class findSecondLargest {

    public int getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findSecondLargest obj = new findSecondLargest();

        
        int result = obj.getSecondLargest(arr);

        
        System.out.println(result);

        sc.close();
    }
}
