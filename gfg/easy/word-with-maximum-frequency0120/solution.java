import java.util.HashMap;
import java.util.Map;

class Solution {
    public String maximumFrequency(String s) {
        String[] words = s.split(" ");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        int maxFreq = 0;
        for (String word : words) {
            maxFreq = Math.max(maxFreq, freqMap.get(word));
        }

        for (String word : words) {
            if (freqMap.get(word) == maxFreq) {
                return word + " " + maxFreq;
            }
        }

        return "";
    }
}