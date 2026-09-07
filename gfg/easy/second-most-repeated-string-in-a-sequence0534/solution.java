import java.util.*;

class Solution {
    public int secFrequent(String[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : arr) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;

        for (int freq : freqMap.values()) {
            if (freq > maxFreq) {
                secondMaxFreq = maxFreq;
                maxFreq = freq;
            } else if (freq < maxFreq && freq > secondMaxFreq) {
                secondMaxFreq = freq;
            }
        }

        if (secondMaxFreq == Integer.MIN_VALUE) {
            return -1;
        }

        return secondMaxFreq;
    }
}