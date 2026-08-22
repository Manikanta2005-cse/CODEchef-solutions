class Solution {
    public int minTime(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum1 += a[i];
                sum2 += b[i];
            } else {
                sum1 += b[i];
                sum2 += a[i];
            }
        }

        return Math.min(sum1, sum2);
    }
}