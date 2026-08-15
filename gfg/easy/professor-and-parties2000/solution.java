import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }
}
