import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> allMersennePrimeNo(int n) {
        List<Integer> result = new ArrayList<>();
        int k = 2;
        while (true) {
            long val = (1L << k) - 1;
            if (val > n) {
                break;
            }
            if (isPrime((int) val)) {
                result.add((int) val);
            }
            k++;
        }
        return result;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}