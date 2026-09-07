class Solution {
    static int repeatedCharacter(String S) {
        int res = -1;
        boolean[] visited = new boolean[256];

        for (int i = S.length() - 1; i >= 0; i--) {
            if (visited[S.charAt(i)]) {
                res = i;
            } else {
                visited[S.charAt(i)] = true;
            }
        }

        return res;
    }
}