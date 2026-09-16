class Solution {
    public int xorOperation(int n, int start) {
        int curr=0;
        for(int i=0;i<n;i++){
            curr^=(start+2*i);
        }
        return curr;

    }
}