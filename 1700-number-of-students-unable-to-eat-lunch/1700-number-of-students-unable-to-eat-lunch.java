class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       int count0=0;
       int count1=0;
       for(int i=0;i<students.length;i++){
        if(students[i]==1){
            count1++;
        }else{
            count0++;
        }
       }
       for(int i=0;i<sandwiches.length;i++){
        if(sandwiches[i]==0){
            if(count0==0){
                break;
            }
            count0--;
        }
        else{
            if(count1==0){
                break;
            }
            count1--;
        }
       }
       return count1+count0;
    }
}