import java.util.*;

class shiftZeros {

    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Object creation
        shiftZeros obj = new shiftZeros();

        // Function call
        obj.pushZerosToEnd(arr);

        // Output array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
