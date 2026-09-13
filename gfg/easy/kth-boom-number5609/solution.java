class Solution {
    public String boomNumber(int k) {
        StringBuilder sb = new StringBuilder();
        long n = k + 1;
        while (n > 1) {
            if ((n & 1) == 0) {
                sb.append('2');
            } else {
                sb.append('3');
            }
            n >>= 1;
        }
        return sb.reverse().toString();
    }
}