import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public char nonRepeatingChar(String s) {
        Set<Character> nonRepeating = new LinkedHashSet<>();
        Set<Character> repeating = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (repeating.contains(ch)) {
                continue;
            }
            if (nonRepeating.contains(ch)) {
                nonRepeating.remove(ch);
                repeating.add(ch);
            } else {
                
                nonRepeating.add(ch);
            }
        }
        if (!nonRepeating.isEmpty()) {
            return nonRepeating.iterator().next();
        }

        return '$';
    }
}