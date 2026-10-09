class Solution {
    public int minInsertions(String s) {
        Stack<Character> S=new Stack<>();
        int insertion=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                S.push(ch);
            }else{
                if((i+1)<s.length() && s.charAt(i+1)==')'){
                    i++;
                }
                else{
                    insertion++;
                }   
            if(!S.isEmpty()){
                S.pop();
            }else{
                insertion++;
            }
        }
        }
         insertion += S.size() * 2;
        return insertion;
        
    }
}