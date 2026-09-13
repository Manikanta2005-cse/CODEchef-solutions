class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int n1 = a.length();
        int n2 = b.length();
        int period = n1 * n2;

        int winsA_period = 0;
        int winsB_period = 0;

        int limit = Math.min(k, period);
        for (int i = 0; i < limit; i++) {
            char ca = a.charAt(i % n1);
            char cb = b.charAt(i % n2);

            if (ca != cb) {
                if ((ca == 'R' && cb == 'S') || (ca == 'S' && cb == 'P') || (ca == 'P' && cb == 'R')) {
                    winsA_period++;
                } else {
                    winsB_period++;
                }
            }
        }

        if (k <= period) {
            return new int[]{winsA_period, winsB_period};
        }

        long fullCycles = (long) k / period;
        int remainder = k % period;

        long totalWinsA = fullCycles * winsA_period;
        long totalWinsB = fullCycles * winsB_period;

        for (int i = 0; i < remainder; i++) {
            char ca = a.charAt(i % n1);
            char cb = b.charAt(i % n2);

            if (ca != cb) {
                if ((ca == 'R' && cb == 'S') || (ca == 'S' && cb == 'P') || (ca == 'P' && cb == 'R')) {
                    totalWinsA++;
                } else {
                    totalWinsB++;
                }
            }
        }

        return new int[]{(int) totalWinsA, (int) totalWinsB};
    }
}