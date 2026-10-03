class Solution {
    public boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    if (sub.length() > sb.length()) {
                        sb.setLength(0);
                        sb.append(sub);
                    }
                }
            }
        }
       return  sb.toString();
        
    }
}