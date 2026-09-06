class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingDouble(o -> o[1]));
        int capacity = truckSize;
        int finalAns = 0;
        for (int i = boxTypes.length - 1; i >= 0; i--) {
            if (capacity >= boxTypes[i][0]) {
                finalAns += boxTypes[i][1] * boxTypes[i][0];
                capacity -= boxTypes[i][0];
            } else {
                finalAns += capacity * boxTypes[i][1];
                break;
            }
        }
        return finalAns;
    }
}