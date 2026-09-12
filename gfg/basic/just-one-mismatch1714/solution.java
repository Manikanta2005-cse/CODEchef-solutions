class Solution {
    public boolean isStringExist(String s, String[] arr) {
        int targetLen = s.length();
        for (String str : arr) {
            if (str.length() != targetLen) {
                continue;
            }
            int diffCount = 0;
            for (int i = 0; i < targetLen; i++) {
                if (s.charAt(i) != str.charAt(i)) {
                    diffCount++;
                    if (diffCount > 1) {
                        break;
                    }
                }
            }
            if (diffCount == 1) {
                return true;
            }
        }
        return false;
    }
}