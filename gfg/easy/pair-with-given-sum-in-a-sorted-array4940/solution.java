class Solution {
    int countPairs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                int leftVal = arr[left];
                int rightVal = arr[right];

                if (leftVal == rightVal) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                }

                int leftCount = 0;
                while (left <= right && arr[left] == leftVal) {
                    leftCount++;
                    left++;
                }

                int rightCount = 0;
                while (left <= right && arr[right] == rightVal) {
                    rightCount++;
                    right--;
                }

                count += leftCount * rightCount;
            }
        }

        return count;
    }
}