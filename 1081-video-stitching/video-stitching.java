class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips,Comparator.comparingInt(o->o[0]));
        int count =0;
        int start=0;
        int end=0;
        int i=0;
        while(start < time){
            int fastest=end;
            while(i<clips.length && clips[i][0]<=start){
                fastest=Math.max(fastest,clips[i][1]);
                i++;
            }
            if(fastest==end){
                return -1;
            }
            count++;
            end=fastest;
            start=end;
        }
        return count;
    }
}