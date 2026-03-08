class closestPrimeNumber {
    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = new boolean[right+1];
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= right; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i*i<= right; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= right; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isPrime[i]){
                list.add(i);
            }
        }

        

        if(list.size()<2){

            return new int[]{-1,-1};

        }
        int[] result = new int[2];

        int minGap = Integer.MAX_VALUE;

        for(int i = 0; i < list.size()-1; i++){
            int p1 = list.get(i);
            int p2 = list.get(i+1);
            int currentGap = p2 - p1;

            if(currentGap < minGap){
                minGap = currentGap;
                result[0] = p1;
                result[1] = p2;

            }

            if(minGap<=2){
                return result;
            }
        }

        return result;


        
    }
}