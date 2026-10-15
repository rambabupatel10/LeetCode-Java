class Solution {
    public int smallestRepunitDivByK(int k) {
        //we know that koi bhi no 2 se divide tbhi hoha jbb 
        //last me 2 or 5 se jbb last me five or 0 ho 
        if(k % 2 ==0 || k % 5 ==0){
            return -1;
        }
          int remender = 0;
        for (int i = 1; i <= k; i++) {
            remender = (remender * 10 + 1) % k;
            if (remender == 0) {
                return i;
            }
        }
        return -1;

        
    }
}