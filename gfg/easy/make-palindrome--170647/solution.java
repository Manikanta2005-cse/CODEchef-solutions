import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean makePalindrome(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int oddCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getKey();
            int count = entry.getValue();

            String rev = new StringBuilder(s).reverse().toString();

            if (s.equals(rev)) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            } else {
                int revCount = map.getOrDefault(rev, 0);
                if (count != revCount) {
                    return false;
                }
            }
        }

        return oddCount <= 1;
    }
}