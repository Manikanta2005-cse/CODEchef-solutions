import java.util.HashMap;

class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            map.put(num, map.get(num) - 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }

        return -1;
    }
}