class Solution {
    public String smallestNumber(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int[] minRight = new int[n];
        int minIdx = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
            minRight[i] = minIdx;
        }

        for (int i = 0; i < n; i++) {
            int bestIdx = -1;

            for (int j = n - 1; j > i; j--) {
                if (i == 0 && arr[j] == '0') {
                    continue;
                }
                if (arr[j] < arr[i]) {
                    if (bestIdx == -1 || arr[j] < arr[bestIdx]) {
                        bestIdx = j;
                    }
                }
            }

            if (bestIdx != -1) {
                char temp = arr[i];
                arr[i] = arr[bestIdx];
                arr[bestIdx] = temp;
                return new String(arr);
            }
        }

        return s;
    }
}