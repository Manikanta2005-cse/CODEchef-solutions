class Solution {
    public boolean sameSeq(String s1, String s2) {
        return reduce(s1).equals(reduce(s2));
    }

    private String reduce(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}