import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> sumClosest(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length < 2) {
            return result;
        }

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int minDiff = Integer.MAX_VALUE;
        int maxAbsDiff = -1;
        int resA = -1;
        int resB = -1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(target - sum);
            int currentAbsDiff = arr[right] - arr[left];

            if (diff < minDiff || (diff == minDiff && currentAbsDiff > maxAbsDiff)) {
                minDiff = diff;
                maxAbsDiff = currentAbsDiff;
                resA = arr[left];
                resB = arr[right];
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        result.add(resA);
        result.add(resB);
        return result;
    }
}