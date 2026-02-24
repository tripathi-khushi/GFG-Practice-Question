public class majority_Element_i {
    
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        int cand = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                cand = arr[i];
            }
            if(arr[i]==cand){
                count++;
            }
            else{
                count--;
            }
        }
        
       for(int i = 0; i < n; i++){
           if(cand==arr[i]){
               count++;
           }
       }
       
       if(count>n/2){
           return cand;
       }
       
       return -1;
        
    }

}
