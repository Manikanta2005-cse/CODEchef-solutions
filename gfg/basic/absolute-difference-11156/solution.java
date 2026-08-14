import java.util.ArrayList;
import java.util.List;

class Solution {
    int[] getDigitDiff1AndLessK(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
           
            if (num < k && num >= 10 && hasAdjacentDiffOne(num)) {
                result.add(num);
            }
        }
        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }

        return resArray;
    }

    
    private boolean hasAdjacentDiffOne(int num) {
        while (num >= 10) {
            int lastDigit = num % 10;
            num /= 10;
            int prevDigit = num % 10;

            if (Math.abs(lastDigit - prevDigit) != 1) {
                return false;
            }
        }
        return true;
    }
}