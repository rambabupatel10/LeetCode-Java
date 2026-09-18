class Solution {
     public boolean divisible(int num) {
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit ==0||num % digit!=0){
                return false;
            }      
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(divisible(i)){
                ans.add(i);
            }

        }
        return ans;
        
    }
}