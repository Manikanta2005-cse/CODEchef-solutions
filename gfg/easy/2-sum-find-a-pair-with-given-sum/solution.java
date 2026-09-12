import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> twoSum(int[] arr, int target) {
        int n = arr.length;
        int[][] numWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            numWithIndex[i][0] = arr[i];
            numWithIndex[i][1] = i;
        }

        Arrays.sort(numWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                return Arrays.asList(numWithIndex[left][0], numWithIndex[right][0]);
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new ArrayList<>();
    }
}