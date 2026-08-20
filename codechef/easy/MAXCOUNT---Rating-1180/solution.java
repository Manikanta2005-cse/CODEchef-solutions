import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] mostFrequent(int N, int[] A) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : A) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int bestElement = Integer.MAX_VALUE;

        for (int element : freqMap.keySet()) {
            int count = freqMap.get(element);

            if (count > maxFreq) {
                maxFreq = count;
                bestElement = element;
            } else if (count == maxFreq) {
                bestElement = Math.min(bestElement, element);
            }
        }

        return new int[]{bestElement, maxFreq};
    }
}