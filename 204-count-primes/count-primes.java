class Solution {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
          if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
        
    }
}