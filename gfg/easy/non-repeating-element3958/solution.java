import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstNonRepeating(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (counts.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }
}