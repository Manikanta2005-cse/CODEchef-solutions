class Solution {
    static int matchGame(Long N) {
        if (N % 5 == 0) {
            return -1;
        }
        return (int)(N % 5);
    }
}