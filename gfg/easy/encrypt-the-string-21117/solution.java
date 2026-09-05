class Solution {
    static String encryptString(String S) {
        StringBuilder ans = new StringBuilder();
        int n = S.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count++;
            if (i == n - 1 || S.charAt(i) != S.charAt(i + 1)) {
                ans.append(S.charAt(i));
                String hex = Integer.toHexString(count);
                for (int j = hex.length() - 1; j >= 0; j--) {
                    ans.append(hex.charAt(j));
                }
                count = 0;
            }
        }

        return ans.reverse().toString();
    }
}