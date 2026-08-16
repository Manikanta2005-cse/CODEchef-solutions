class Solution {
    public static char getMaxOccuringChar(String line) {
        int[] freq = new int[26];

        for (int i = 0; i < line.length(); i++) {
            freq[line.charAt(i) - 'a']++;
        }

        int maxFreq = 0;
        char result = 'a';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'a');
            }
        }

        return result;
    }
}