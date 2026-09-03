class Solution {
    public static boolean checkPangram(String s) {
        if (s == null || s.length() < 26) {
            return false;
        }

        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!visited[index]) {
                    visited[index] = true;
                    count++;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A';
                if (!visited[index]) {
                    visited[index] = true;
                    count++;
                }
            }

            if (count == 26) {
                return true;
            }
        }

        return count == 26;
    }
}