class Solution {
    public int maximumSum(int[] arr) {
        int delete=arr[0];
        int present=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            delete=Math.max(present,delete+arr[i]);

            present=Math.max(arr[i],present+arr[i]);

            ans=Math.max(ans,Math.max(present,delete));
        }
        return ans;
    }
}