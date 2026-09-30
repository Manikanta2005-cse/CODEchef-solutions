class Solution {
    public int earliestLastOcc(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            boolean foundRight = false;
            for (int i = arr.length - 1; i > left; i--) {
                if (arr[i] == arr[left]) {
                    foundRight = true;
                    break;
                }
            }

            if (!foundRight) {
                return arr[left];
            }

            left++;
        }

        return result;
    }
}