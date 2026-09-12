class Solution {
    public String[] splitString(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                special.append(ch);
            }
        }

        String s1 = letters.length() > 0 ? letters.toString() : "-1";
        String s2 = digits.length() > 0 ? digits.toString() : "-1";
        String s3 = special.length() > 0 ? special.toString() : "-1";

        return new String[]{s1, s2, s3};
    }
}