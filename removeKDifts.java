public class removeKDifts {
    
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        if(num.length()==k){
            return "0";
        }
        int n = num.length();
        for(int i = 0; i < n; i++){
            char ch = num.charAt(i);
            while(!s.isEmpty() && s.peek()>= ch && k>0 ){
                s.pop();
                k--;

            }
            
             s.push(ch);
            
         }

        while(k>0){
                s.pop();
                k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse();
        while(sb.length()> 1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString(); 






    }
}

