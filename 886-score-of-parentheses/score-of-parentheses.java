class Solution {
    public int scoreOfParentheses(String s) {
       int open=0;
       int ans=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            open++;
        }else{
        if(s.charAt(i-1)=='('){
            ans+=1 << (open - 1);
        }
        open--;
        }
       }
      return  ans;
    }
}