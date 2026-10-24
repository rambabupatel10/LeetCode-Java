class Solution {
    public int convert(String date, int[] days) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int total = day;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int[] days = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
        int aliceStart = convert(arriveAlice, days);
        int aliceEnd = convert(leaveAlice, days);
        int bobStart = convert(arriveBob, days);
        int bobEnd = convert(leaveBob, days);
        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);
        if (start > end) {
            return 0;
        }
        return end - start + 1;
        
    }
}