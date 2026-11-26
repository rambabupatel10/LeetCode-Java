class Solution {
    public boolean canAliceWin(int n) {
        int pick=10;
        int k=0;
        while(n>=pick){
            n-=pick;
            pick--;
            k++;
        }
        return k % 2==1;
        
    }
}