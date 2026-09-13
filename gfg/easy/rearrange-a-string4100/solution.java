class Solution {
    public String arrangeString(String s) {
        int[] charCount = new int[26];
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            } else if (Character.isUpperCase(ch)) {
                charCount[ch - 'A']++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (charCount[i] > 0) {
                sb.append((char) ('A' + i));
                charCount[i]--;
            }
        }

        if (sum > 0) {
            sb.append(sum);
        }

        return sb.toString();
    }
}