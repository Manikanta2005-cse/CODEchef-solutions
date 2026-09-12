class Solution {
    public boolean isGoodString(String s) {
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i + 1));
            int cyclicDist = Math.min(diff, 26 - diff);
            if (cyclicDist != 1) {
                return false;
            }
        }
        return true;
    }
}