import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        if (isAnagram(s, t)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}