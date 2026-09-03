import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> sentenceWord(String s) {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        int sentenceCount = 0;
        boolean hasTokens = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                if (hasTokens) {
                    sentenceCount++;
                    hasTokens = false;
                }
                while (i + 1 < s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == '.' || next == '!' || next == '?') {
                        i++;
                    } else {
                        break;
                    }
                }
            } else {
                if (c != ' ') {
                    hasTokens = true;
                }
            }
        }

        if (hasTokens) {
            sentenceCount++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(sentenceCount);
        result.add(wordCount);
        return result;
    }
}