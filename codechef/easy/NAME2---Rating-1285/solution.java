import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String m = sc.next();
            String w = sc.next();
            if (isSubsequence(m, w) || isSubsequence(w, m)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        int n1 = s1.length();
        int n2 = s2.length();
        while (i < n1 && j < n2) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n1;
    }
}