class Solution {
    public int countElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > maxSoFar) {
                count++;
                maxSoFar = num;
            }
        }

        return count;
    }
}