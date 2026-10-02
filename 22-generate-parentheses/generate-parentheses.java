class Solution {
     void parenthesis(String str ,int open ,int close,int n,List<String>ans){
            if(open==n && close == n){
                ans.add(str);
                return;
            }
            if(open < n){
                parenthesis(str+"(",open+1,close,n,ans);
                }
                if(close<open){
                    parenthesis(str+")",open,close+1,n,ans);
                    }
                }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        parenthesis("",0,0,n,ans);
        return ans;
    }
}