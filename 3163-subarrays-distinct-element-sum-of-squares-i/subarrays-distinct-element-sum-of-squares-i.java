class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int ans=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[101];
            int differ=0;
            for(int j=i;j<n;j++){
                int x=nums.get(j);
                if(freq[x]==0){
                    differ++;
                }
            freq[x]++;
            ans+=differ*differ;
            }
        }
        return ans;  
    }
}