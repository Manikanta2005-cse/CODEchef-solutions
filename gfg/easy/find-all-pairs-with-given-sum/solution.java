import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }
}