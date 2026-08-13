import java.util.Arrays;

class Solution {
    void segregateEvenOdd(int arr[]) {
        int n = arr.length;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        
        int[] even = new int[evenCount];
        int[] odd = new int[n - evenCount];
        int e = 0, o = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[e++] = arr[i];
            } else {
                odd[o++] = arr[i];
            }
        }
        
        Arrays.sort(even);
        Arrays.sort(odd);
        
        for (int i = 0; i < evenCount; i++) {
            arr[i] = even[i];
        }
        for (int i = 0; i < n - evenCount; i++) {
            arr[evenCount + i] = odd[i];
        }
    }
}