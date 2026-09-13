class Solution {
    public static long modified(String a) {
        long count = 0;
        int sameCount = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                sameCount++;
            } else {
                count += (sameCount - 1) / 2;
                sameCount = 1;
            }
        }
        count += (sameCount - 1) / 2;

        return count;
    }
}