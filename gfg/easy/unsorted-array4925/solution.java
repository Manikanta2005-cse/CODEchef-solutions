class Solution {
    public int findElement(int[] arr) {
        int n = arr.length;
        if (n < 3) return -1;

        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        int[] rightMin = new int[n];
        rightMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            if (leftMax[i - 1] <= arr[i] && arr[i] <= rightMin[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }
}