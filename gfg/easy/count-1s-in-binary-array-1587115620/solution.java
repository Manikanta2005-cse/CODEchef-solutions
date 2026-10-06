class Solution {
    public int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                ans = mid + 1;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}