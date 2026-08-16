class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int start=1;
        int end=max;
        while(start <= end){
            int mid=start+(end-start)/2;
            long k=0;
            for(int i=0;i<piles.length;i++){
                k +=Math.ceil((double)piles[i]/mid);
            }
            if(k<=h){
                end=mid-1;
            }else{
                start=mid+1;
        }
        }
        return start;
        
    }
}