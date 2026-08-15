import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            Map<Integer, Integer> freqMap = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(freqMap.get(arr[i]) + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}