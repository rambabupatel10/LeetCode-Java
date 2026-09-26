class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
          HashMap<String, String>map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(') {
                ans.append(s.charAt(i));
            }
            else {
                int j = i + 1;
                for (; s.charAt(j) != ')'; j++) {
                }
                String key = s.substring(i+1, j);
                if (map.containsKey(key)) {
                    ans.append(map.get(key));
                } else {
                    ans.append("?");
                }
                i = j;
            }
        }
        return ans.toString();
    }
}