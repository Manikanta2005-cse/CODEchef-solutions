import java.util.HashSet;
import java.util.Set;

class Solution {
    int findSum(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            
            if (set.add(num)) {
                sum += num;
            }
        }

        return sum;
    }
}