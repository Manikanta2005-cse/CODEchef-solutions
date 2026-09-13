class Solution {
    static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    long countStrings(int n, int r, int b, int g) {
        int remaining = n - (r + b + g);
        if (remaining < 0) {
            return 0;
        }

        long ans = 0;
        long nFact = fact(n);

        for (int i = 0; i <= remaining; i++) {
            for (int j = 0; j <= remaining - i; j++) {
                int k = remaining - i - j;

                int totalR = r + i;
                int totalB = b + j;
                int totalG = g + k;

                long count = nFact / (fact(totalR) * fact(totalB) * fact(totalG));
                ans += count;
            }
        }

        return ans;
    }
}