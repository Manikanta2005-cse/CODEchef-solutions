class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= n) break;

            int start = i;
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }

            StringBuilder word = new StringBuilder(s.substring(start, i));
            word.reverse();

            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();
    }
}