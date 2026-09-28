class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int dept=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                dept++;
                if(dept>1){
                    sb.append(ch);
                }
                }else{
                    dept--;
                    if(dept>0){
                        sb.append(ch);
                    }
            }
        }
       return sb.toString();
    }
}