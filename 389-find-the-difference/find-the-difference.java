class Solution {
    public char findTheDifference(String s, String t) {
        char finalAns=0;
        for(int i=0;i<s.length();i++){
            finalAns^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            finalAns^=t.charAt(i);
        }
        return finalAns;
        
    }
}