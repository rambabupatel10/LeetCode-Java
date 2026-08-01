class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int nextGrater[]=new int [nums.length];
     Stack<Integer> s=new Stack<>();
     for(int i=2*nums.length-1;i>=0; i--){
        int idx=i%nums.length;
        while(!s.isEmpty() && nums[s.peek()] <= nums[idx]){
            s.pop();
        }
        if(i<nums.length){
        if(s.isEmpty()){
            nextGrater[idx]=-1;
        }else{
            nextGrater[idx]=nums[s.peek()];
        }
        }
        s.push(idx);
        }

     return nextGrater;
        
    }
}