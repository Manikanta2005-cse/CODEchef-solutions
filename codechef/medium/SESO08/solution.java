import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int bestElement = 0;
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int diff = Math.abs(num - k);
            
            if (diff < minDiff) {
                minDiff = diff;
                bestElement = num;
            } else if (diff == minDiff) {
                if (num < bestElement) {
                    bestElement = num;
                }
            }
        }
        
        System.out.println(bestElement);
    }
}