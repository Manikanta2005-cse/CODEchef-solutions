class Solution {
    public String removeChars(String s1, String s2) {
        boolean[] present = new boolean[256];
        for (int i = 0; i < s2.length(); i++) {
            present[s2.charAt(i)] = true;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!present[ch]) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}