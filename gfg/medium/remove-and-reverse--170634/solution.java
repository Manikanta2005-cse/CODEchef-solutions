import java.util.*;

class Solution {
    String removeReverse(String S) {
        int[] freq = new int[26];
        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = S.length() - 1;
        boolean dir = true;
        int removeCount = 0;
        char[] sArr = S.toCharArray();

        while (left <= right) {
            if (dir) {
                char ch = sArr[left];
                if (freq[ch - 'a'] > 1) {
                    freq[ch - 'a']--;
                    sArr[left] = '#';
                    dir = !dir;
                    removeCount++;
                }
                left++;
            } else {
                char ch = sArr[right];
                if (freq[ch - 'a'] > 1) {
                    freq[ch - 'a']--;
                    sArr[right] = '#';
                    dir = !dir;
                    removeCount++;
                }
                right--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : sArr) {
            if (ch != '#') {
                sb.append(ch);
            }
        }

        if (removeCount % 2 != 0) {
            sb.reverse();
        }

        return sb.toString();
    }
}