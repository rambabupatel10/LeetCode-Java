class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> q=new LinkedList<>();
        int freq[]=new int [26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(i);
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
           
    }
}