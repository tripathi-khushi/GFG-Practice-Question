import java.util.ArrayList;

public class findMinMax {
    public ArrayList<Integer> getMinMax(int[] arr) {

        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);

        return ans;
    }
}
