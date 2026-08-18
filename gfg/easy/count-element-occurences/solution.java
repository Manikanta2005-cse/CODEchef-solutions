import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countOccurence(int[] arr, int k) {
        int n = arr.length;
        int target = n / k;

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq > target) {
                count++;
            }
        }

        return count;
    }
}