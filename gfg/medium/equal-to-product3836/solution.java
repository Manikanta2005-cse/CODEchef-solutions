import java.util.*;
class Solution {
    public boolean isProduct(int[] arr, long target) {
        HashSet<Long> set = new HashSet<>();
        for (int x : arr) {
            if (x == 0) {
                if (target == 0 && set.contains(0L)) return true;
            } else if (target % x == 0 && set.contains(target / x)) {
                return true;
            }
            set.add((long) x);
        }
        return false;
    }
}