class Solution {
    int typeOfArr(int arr[]) {
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        if (arr[0] == min && arr[n - 1] == max) {
            return 1;
        }
        if (arr[0] == max && arr[n - 1] == min) {
            return 2;
        }
        if (arr[0] < arr[n - 1]) {
            return 3;
        }
        return 4;
    }
}