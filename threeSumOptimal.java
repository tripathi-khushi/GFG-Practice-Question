import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumOptimal {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++){
            int low = i+1;
            int high = nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    result.add(list);
                    while(low<high && nums[low]==nums[low+1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high-1]){
                        high--;
                    }

                    low++;
                    high--;
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }

        return result;
        
    }

    
}
