class Solution {
    public boolean smithNum(int n) {
        if (isPrime(n)) {
            return false;
        }

        int digitSum = getSumOfDigits(n);
        int primeFactorDigitSum = 0;
        int temp = n;

        for (int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                primeFactorDigitSum += getSumOfDigits(i);
                temp /= i;
            }
        }

        if (temp > 1) {
            primeFactorDigitSum += getSumOfDigits(temp);
        }

        return digitSum == primeFactorDigitSum;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}