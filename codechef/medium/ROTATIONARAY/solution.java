class Solution {
    public int countRotations(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            if (nums[low] <= nums[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;

            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }

            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }
}