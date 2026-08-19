import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        int currentSum = 0;
        for (int num : arr) {
            currentSum += num;
            result.add(currentSum);
        }

        return result;
    }
}