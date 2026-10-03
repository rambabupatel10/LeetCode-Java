class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>st=new Stack<>();
         st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            //agr ( ye wala hai to add kro nhi to nhi
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop();
            }
            if(st.isEmpty()){
                st.push(i);
            }else{
                //yaha hmm check krr rahe hai ki kon sa maximim hai 
                //kyoki i-st.peek() is giving valid substring
                max=Math.max(max,i-st.peek());
            }
        }
        return max;
        
    }
}