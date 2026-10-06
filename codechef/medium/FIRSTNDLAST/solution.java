class Solution {
    public int[] searchRange(int[] arr, int key) {
        int first = findBound(arr, key, true);
        if (first == -1) return new int[]{-1, -1};
        int last = findBound(arr, key, false);
        return new int[]{first, last};
    }

    private int findBound(int[] arr, int key, boolean isFirst) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                ans = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}