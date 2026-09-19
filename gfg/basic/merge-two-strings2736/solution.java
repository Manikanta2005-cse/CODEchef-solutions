class Solution {
    String merge(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int n1 = s1.length(), n2 = s2.length();

        while (i < n1 || j < n2) {
            if (i < n1) {
                result.append(s1.charAt(i));
                i++;
            }
            if (j < n2) {
                result.append(s2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}