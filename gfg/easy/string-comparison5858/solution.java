class Solution {
    public int compareStrings(String s1, String s2) {
        int i = 0, j = 0;
        int n1 = s1.length(), n2 = s2.length();

        while (i < n1 && j < n2) {
            int p1 = getPriority(s1, i);
            int p2 = getPriority(s2, j);

            if (p1 != p2) {
                return p1 > p2 ? 1 : -1;
            }

            i += (p1 == 14) ? 2 : 1;
            j += (p2 == 14) ? 2 : 1;
        }

        if (i < n1) return 1;
        if (j < n2) return -1;
        return 0;
    }

    private int getPriority(String s, int index) {
        if (index + 1 < s.length() && s.charAt(index) == 'n' && s.charAt(index + 1) == 'g') {
            return 14;
        }

        char c = s.charAt(index);
        int val = c - 'a';

        if (c > 'n') {
            return val + 1;
        }
        return val;
    }
}