class Solution {
    public int[] singleNum(int[] arr) {
        int xorResult = 0;
        for (int num : arr) {
            xorResult ^= num;
        }

        int rightmostSetBit = xorResult & -xorResult;

        int num1 = 0;
        int num2 = 0;

        for (int num : arr) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        if (num1 > num2) {
            return new int[]{num2, num1};
        } else {
            return new int[]{num1, num2};
        }
    }
}