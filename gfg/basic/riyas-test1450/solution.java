class Solution {
    public boolean halvesMatch(String s) {
        int n = s.length();
        int mid = n / 2;
        int[] freq = new int[26];

        for (int i = 0; i < mid; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int startSecondHalf = (n % 2 == 0) ? mid : mid + 1;

        for (int i = startSecondHalf; i < n; i++) {
            freq[s.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}