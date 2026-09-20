class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int ch = 'z' - s.charAt(i) + 1;
           int prod=ch*(i+1);
           sum+=ch*(i+1);
        }
        return sum;
    }
}