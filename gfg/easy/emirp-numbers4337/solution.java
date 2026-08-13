import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] emirpNumbers(int n) {
        if (n < 13) {
            return new int[0];
        }

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 13; i <= n; i++) {
            if (isPrime[i]) {
                int rev = reverse(i);
                if (rev != i && rev <= n && isPrime[rev]) {
                    list.add(i);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}