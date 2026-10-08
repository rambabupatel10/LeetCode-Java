class Solution {
    List<String> ans = new ArrayList<>();
    StringBuilder curr = new StringBuilder();
    int maxLength = 0;

    public List<String> removeInvalidParentheses(String s) {
        backtrack(s, 0, 0);
        return ans;
    }
    void backtrack(String s, int index, int count) {
        if (index == s.length()) {
            if (count == 0) {
                if (curr.length() > maxLength) {
                    ans.clear();
                    maxLength = curr.length();
                    ans.add(curr.toString());
                } else if (curr.length() == maxLength) {
                    String str = curr.toString();
                    if (!ans.contains(str)) {
                        ans.add(str);
                    }
                }
            }
            return;
        }
        char ch = s.charAt(index);
        if (Character.isLetter(ch)) {
            curr.append(ch);
            backtrack(s, index + 1, count);
            curr.deleteCharAt(curr.length() - 1);
        } else if (ch == '(') {
            curr.append('(');
            backtrack(s, index + 1, count + 1);
            curr.deleteCharAt(curr.length() - 1);
            backtrack(s, index + 1, count);
        } else {
            if (count > 0) {
                curr.append(')');
                backtrack(s, index + 1, count - 1);
                curr.deleteCharAt(curr.length() - 1);
            }
            backtrack(s, index + 1, count);
        }
    }
}