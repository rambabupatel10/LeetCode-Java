class Solution {
    public int numOfSubarrays(int[] arr) {
        int even = 1, odd = 0;
        int sum = 0, count = 0;
        int mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum % 2 == 0) {
                count = (count + odd) % mod;
                even++;
            } else {
                count = (count + even) % mod;
                odd++;
            }
        }
        return count;
    }
}