import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tc-- > 0) {
            String[] nm = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            String s = br.readLine().trim();
            String t = br.readLine().trim();
            
            String res = minWindowSubstring(s, t);
            sb.append(res).append("\n");
        }
        System.out.print(sb.toString());
    }

    private static String minWindowSubstring(String s, String t) {
        int[] need = new int[128];
        int[] window = new int[128];
        
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        
        int required = t.length();
        int left = 0, minLen = Integer.MAX_VALUE, startIdx = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            
            if (need[rChar] > 0) {
                window[rChar]++;
                if (window[rChar] <= need[rChar]) {
                    required--;
                }
            }
            
            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIdx = left;
                }
                
                char lChar = s.charAt(left);
                if (need[lChar] > 0) {
                    window[lChar]--;
                    if (window[lChar] < need[lChar]) {
                        required++;
                    }
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "-1" : s.substring(startIdx, startIdx + minLen);
    }
}