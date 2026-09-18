class Solution {
    public int countDigits(int num) {
        int count=0;
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(num % digit==0){
                count++;
            }      
        }
        return count;
        
    }
}