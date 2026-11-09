
class Solution {

    public int numSquares(int n) {
        if (isPerfectSquare(n)) {
            return 1;
        }
        for (int i = 1; i * i <= n; i++) {
            int remaining = n - i * i;
            if (isPerfectSquare(remaining)) {
                return 2;
            }
        }
        int temp = n;
        while (temp % 4 == 0) {
            temp /= 4;
        }
        if (temp % 8 == 7) {
            return 4;
        }
        return 3;
    }
    private boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
