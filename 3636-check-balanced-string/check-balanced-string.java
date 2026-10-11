class Solution {
    public boolean isBalanced(String num) {
        int num1=0;
        int num2=0;
        for(int i=0;i<num.length();i++){
            int n = num.charAt(i) - '0';
            if(i % 2==0){
                num1+=n;
            }else{
                num2+=n;
            }
        }
        return num1==num2;     
    }
}