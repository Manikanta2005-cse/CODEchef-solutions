import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(c);
            }
        }
        return vowels.size();
    }
}