import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            
            if (a.length() != b.length()) {
                System.out.println("NO");
                continue;
            }
            
            int[] freq = new int[26];
            for (int i = 0; i < a.length(); i++) {
                freq[a.charAt(i) - 'a']++;
                freq[b.charAt(i) - 'a']--;
            }
            
            boolean isAnagram = true;
            for (int count : freq) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }
            
            if (isAnagram) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}