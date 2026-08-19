class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        long save = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] >= y) {
                save += y;
            } else {
                save += prices[i];
            }
        }
        if (save > x) {
            return "COUPON";
        } else {
            return "NO COUPON";
        }
    }
}