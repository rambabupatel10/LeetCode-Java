class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if( !s1.isEmpty() && s1.peek()==ch){
                s1.pop();
            }else{
                s1.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();

while (!s1.isEmpty()) {
    sb.append(s1.pop());
}

return sb.reverse().toString();
    }
}