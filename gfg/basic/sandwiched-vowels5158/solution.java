class Solution {
    public String sandwichedVowel(String s) {
        int n = s.length();
        if (n <= 2) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < n - 1; i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            char next = s.charAt(i + 1);

            if (isVowel(curr) && !isVowel(prev) && !isVowel(next)) {
                continue;
            }
            sb.append(curr);
        }

        sb.append(s.charAt(n - 1));
        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
