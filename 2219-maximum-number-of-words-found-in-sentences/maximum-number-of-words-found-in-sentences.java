class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int j = 0; j < sentences.length; j++) {
        String str = sentences[j];
            int count = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}