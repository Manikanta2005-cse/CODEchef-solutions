import java.util.HashSet;
import java.util.Set;

class Solution {
    static int distinct(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}