import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (isAcronym(word)) {
                    result.append(word);
                } else {
                    result.append(Character.toUpperCase(word.charAt(0)));
                    if (word.length() > 1) {
                        result.append(word.substring(1).toLowerCase());
                    }
                }
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
            System.out.println(result.toString());
        }
    }

    private static boolean isAcronym(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}