class Solution {
    int calcDiff(String s) {
        String[] words = s.split(" ");
        int hardCount = 0;
        int easyCount = 0;

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            int vowels = 0;
            int consonants = 0;
            int consecutiveConsonants = 0;
            boolean hasFourConsecutiveConsonants = false;

            for (char ch : word.toCharArray()) {
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh >= 'a' && lowerCh <= 'z') {
                    if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                        vowels++;
                        consecutiveConsonants = 0;
                    } else {
                        consonants++;
                        consecutiveConsonants++;
                        if (consecutiveConsonants == 4) {
                            hasFourConsecutiveConsonants = true;
                        }
                    }
                }
            }

            if (hasFourConsecutiveConsonants || consonants > vowels) {
                hardCount++;
            } else {
                easyCount++;
            }
        }

        return (5 * hardCount) + (3 * easyCount);
    }
}