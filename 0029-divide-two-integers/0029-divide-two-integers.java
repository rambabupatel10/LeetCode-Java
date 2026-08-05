class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean negative = (dividend < 0) ^ (divisor < 0);

         long dvd = Math.abs((long)dividend);
        long dvr = Math.abs((long)divisor);

        int ans=0;
        while(dvd >= dvr){
            int count=0;
            while(dvd >= (dvr << (count+1))){
                count++;
            }
                ans+=(1 << count);
            dvd-=(dvr<<count);
        }
        if (negative) {
           ans = -ans;
        }
        return ans;
    }
}