class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        for (int num : nums1) {
            seen[num] = true;
        }

        int count = 0;
        for (int num : nums2) {
            if (seen[num]) {
                seen[num] = false;
                nums1[count++] = num;
            }
        }

        int[] result = new int[count];
        System.arraycopy(nums1, 0, result, 0, count);
        return result;
    }
}