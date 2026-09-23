class Solution {
    public boolean checkIfPangram(String sentence) {
        // if(sentence.length()<26){
        //     return false;
        // }
        for(char ch = 'a'; ch <= 'z'; ch++) {
            boolean found=false;
        for(int i=0;i<sentence.length();i++){
            if(ch==sentence.charAt(i)){
                found=true;
                break;
            }
        }
        if(!found){
            return false;
        }
        }
        return true;
        
    }
}