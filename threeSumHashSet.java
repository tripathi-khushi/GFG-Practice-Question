public class threeSumHashSet {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result  = new ArrayList<>();
       
        Set<List<Integer>> resultset = new HashSet<>();
        for(int i = 0; i < nums.length-2; i++){
             Set<Integer> set = new HashSet<>();
             int target = 0;
           
            for(int j = i+1; j < nums.length; j++){
                int complement = target - nums[i] - nums[j];
               
                if(set.contains(complement)){
                     List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(complement);
                    Collections.sort(list);
                    resultset.add(list);
                    


                }
                else{
                    set.add(nums[j]);
                }
            }
        }

        return new ArrayList<>(resultset);
    }

}
