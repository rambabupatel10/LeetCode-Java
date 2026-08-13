class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (hour <= dist.length - 1) {
            return -1;
        }

        int start = 1;
        int end = 10000000;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            double speed = 0;
            for (int i = 0; i < dist.length; i++) {

                if (i == dist.length - 1) {
                    speed += (double) (dist[i]) / mid;
                   
                } else {
                     speed += (dist[i] + mid - 1) / mid;
                }
            }

            if (speed <= hour) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}