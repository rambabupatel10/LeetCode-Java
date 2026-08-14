class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(!s.isEmpty() && asteroids[i]<0 && s.peek()>0 ){
                int sum=asteroids[i]+s.peek();
                if(sum<0){
                    s.pop();
                }
                else if(sum>0){
                    asteroids[i]=0;
                    break;
                }else{
                    asteroids[i]=0;
                    s.pop();
                    break;

                }
            }
            if(asteroids[i]!=0){
                s.push(asteroids[i]);
         } 
        }
         int sz=s.size();
        int ans[]=new int[sz];
        int i=sz-1;
    while(!s.isEmpty()){
    ans[i]=s.peek();
    s.pop();
    i--;
    }
    return ans;
    }
}