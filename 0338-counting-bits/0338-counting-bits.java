class Solution {
    public int[] countBits(int n) {
        int ans[]=new int [n+1];
        ans[0]=0;
        if(n>=1){
            ans[1]=1;
        }
        for(int i=2;i<n+1;i++){
            int count=0;
            int temp=i;
            while(temp>0){
                if((temp&1)==1){
                    count++;
                }
                temp>>=1;
            }
            ans[i]=count;
        }
        return ans;
    }
}