class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        int missing = 0;

        for (int num : arr1) {
            missing ^= num;
        }

        for (int num : arr2) {
            missing ^= num;
        }
        return missing;
    }
}