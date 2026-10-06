class Solution {
    public int minSwaps(String s) {
        int count=0;
        Stack<Character>S=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                S.push(ch);
            }else{
                if(!S.isEmpty()){
                    S.pop();
                }else{
                    count++;
                }
            }
        }
        return (count+1)/2;
        
    }
}