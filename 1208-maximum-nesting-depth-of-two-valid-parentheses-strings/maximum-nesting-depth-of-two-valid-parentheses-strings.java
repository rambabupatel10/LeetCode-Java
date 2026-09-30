class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int ans[]=new int [seq.length()];
        int depth=0;
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                depth++;
                if(depth % 2 == 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
            } else if(ch == ')') { 
                
                if(depth % 2 == 0) { 
                    ans[i] = 0; 
                } else { 
                    ans[i] = 1; 
                } 

                depth--; 
            } 
        } 
        return ans;
        
    }
}