class Solution {
    boolean present(String[]strs,int index){
        char ch=strs[0].charAt(index);
            for(int i=1;i<strs.length;i++){
                if(index>=strs[i].length() || strs[i].charAt(index)!=ch){
                    return false;
                }
            }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<strs[0].length();j++){
            if(present(strs,j)){
                sb.append(strs[0].charAt(j));
            }else{
                break;
            }
        }
        return sb.toString();
        
    }
}