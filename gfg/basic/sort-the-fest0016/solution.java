import java.util.*;
class Solution {
    public boolean commonString(String[] s, String[] t) {
        Set<String> set = new HashSet<>();
        for (String str : s) {
            set.add(str);
        }
        for (String str : t) {
            if (set.contains(str)) {
                return true;
            }
        }
        return false;
    }
}