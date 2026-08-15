class Solution {
    public int uniqueElement(int[] arr, int k) {
        int[] bitCounts = new int[32];

        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCounts[i]++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCounts[i] % k != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}