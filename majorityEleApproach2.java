import java.util.*;
public class majorityEleApproach2 {
    public static int majority(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        int cand = nums[n/2];

        int count = 0;

        for(int i = 0; i < n; i++){
            if(n==cand){
                count++;
            }
        }

        if(count>n/2){
            return cand;
        }
        else{
            return -1;
        }


    }
    
}
