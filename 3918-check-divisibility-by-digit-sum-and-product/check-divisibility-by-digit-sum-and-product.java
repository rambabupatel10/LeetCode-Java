class Solution {
    public boolean checkDivisibility(int n) {
        int  original=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        
       return original %(sum+prod)==0;
    }
}