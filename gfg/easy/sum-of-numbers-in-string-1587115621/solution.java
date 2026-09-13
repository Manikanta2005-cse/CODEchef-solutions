class Solution {
    public static int findSum(String s) {
        int sum = 0;
        int currentNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            } else {
                sum += currentNumber;
                currentNumber = 0;
            }
        }
        sum += currentNumber;

        return sum;
    }
}