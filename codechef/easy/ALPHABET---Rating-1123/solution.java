import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        Set<Character> knownLetters = new HashSet<>();
        for (char c : s.toCharArray()) {
            knownLetters.add(c);
        }
        
        int n = sc.nextInt();
        while (n-- > 0) {
            String word = sc.next();
            boolean canRead = true;
            for (char c : word.toCharArray()) {
                if (!knownLetters.contains(c)) {
                    canRead = false;
                    break;
                }
            }
            if (canRead) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}