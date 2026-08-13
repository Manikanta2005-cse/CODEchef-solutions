class Solution {
    public static boolean isPalinArray(int[] arr) {
        for (int num : arr) {
            if (!isPalindrome(num)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return rev == n;
    }
}