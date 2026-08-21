class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        int freq[]=new int [26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch1=t.charAt(i);
            freq[ch1-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i] !=0){
                return false;
            }
        }
        return true;

    }
}