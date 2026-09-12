class Solution {
    public String extractMessage(String s) {
        return s.replaceAll("(LIE)+", " ").trim();
    }
}