import java.util.HashSet;
import java.util.Set;

class Solution {
    static int countDistinctPairs(int arr[], int target) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> pairComplements = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement) && !pairComplements.contains(complement) && !pairComplements.contains(num)) {
                count++;
                pairComplements.add(complement);
                pairComplements.add(num);
            }
            seen.add(num);
        }

        return count;
    }
}