class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int calculated=1;
        while(true){
            if(i < arr.length && arr[i]==calculated){
                i++;
            }else{
                k--;
                if(k==0){
                    return calculated;
                }
            }
            calculated++;
        } 
    }
}