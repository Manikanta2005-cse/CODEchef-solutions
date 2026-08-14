import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            result.add(arr[i]);
        }
        for (int i = n - 1; i >= mid; i--) {
            result.add(arr[i]);
        }

        return result;
    }
}