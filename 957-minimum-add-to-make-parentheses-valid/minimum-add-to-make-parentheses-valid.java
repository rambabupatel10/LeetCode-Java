class Solution {
    public int minAddToMakeValid(String s) {
        int answer=0;
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stk.push(ch);
            }else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
                else{
                    answer++;
                }
            }
        }
        return answer+stk.size();

        
    }
}