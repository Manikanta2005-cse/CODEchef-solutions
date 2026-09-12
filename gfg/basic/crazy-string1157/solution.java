class Solution {
    public String altCase(String s) {
        StringBuilder result = new StringBuilder();
        boolean isLower = Character.isLowerCase(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLower) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
            isLower = !isLower;
        }

        return result.toString();
    }
}