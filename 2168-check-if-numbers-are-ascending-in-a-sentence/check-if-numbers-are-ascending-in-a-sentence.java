class Solution {
    public boolean areNumbersAscending(String s) {
        String arr[] = s.split(" ");
        int prev = 0;
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if (Character.isDigit(str.charAt(0))) {
                int curr = Integer.parseInt(str);

                if (curr <= prev) {
                    return false;
                }

                prev = curr;
            }
        }
        return true;
    }
}