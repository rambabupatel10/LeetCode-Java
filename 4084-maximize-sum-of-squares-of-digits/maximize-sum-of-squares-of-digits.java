class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans=new StringBuilder();
        if(sum>9*num){
            return "";
        }
        if(sum < 1){
            return "";
        }
        while(sum>=9){
            ans.append(9);
            sum-=9;
        }
        if(sum>0){
            ans.append(sum);
        }
        while(ans.length()<num){
            ans.append(0);
        }

        return ans.toString();
    }
}