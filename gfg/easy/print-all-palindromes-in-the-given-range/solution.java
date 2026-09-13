import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            if (isPalindrome(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}