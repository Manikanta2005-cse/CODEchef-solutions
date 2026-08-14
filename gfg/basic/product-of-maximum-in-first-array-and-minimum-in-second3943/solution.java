class Solution {
    public long minMaxProduct(int[] arr1, int[] arr2) {
        long max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        long min = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }

        return max * min;
    }
}