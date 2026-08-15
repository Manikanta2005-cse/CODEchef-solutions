import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max_element = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > max_element) {
                    max_element = arr[i];
                }
            }
            
            int[] hash = new int[max_element + 1];
            
            for (int i = 0; i < n; i++) {
                hash[arr[i]]++;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(hash[arr[i]] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}