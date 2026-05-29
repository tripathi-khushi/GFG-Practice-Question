import java.util.List;

class sumofArray {
    public int arraySum(List<Integer> arr) {
        // code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum = sum + arr.get(i);
        }
        
        return sum;
    }
    
};