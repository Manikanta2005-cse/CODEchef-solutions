import java.util.HashSet;
 import java.util.Set;

 class Solution {
     public boolean nonRepetitive(String s) {
         Set<Character> seen = new HashSet<>();
         char prev = '\0';

         for (int i = 0; i < s.length(); i++) {
             char curr = s.charAt(i);
             if (curr != prev) {
                 if (seen.contains(curr)) {
                     return false;
                 }
                 seen.add(curr);
                 prev = curr;
             }
         }
         return true;
     }
 }