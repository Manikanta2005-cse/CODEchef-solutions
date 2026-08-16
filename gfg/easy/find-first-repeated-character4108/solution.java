class Solution {
    String firstRepChar(String s) {
        boolean[] vis = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vis[ch - 'a']) {
                return String.valueOf(ch);
            }
            vis[ch - 'a'] = true;
        }
        return "-1";
    }
}