class Solution {
    public boolean isPowerOfFour(int n) {
        for(int x=0;x<32;x++){
            if(x%2==0 && (1<<x)==n){
                return true;
            }
        }
        return false;
        
    }
}