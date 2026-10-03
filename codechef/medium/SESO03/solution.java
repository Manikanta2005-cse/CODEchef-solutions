import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read n (size of array) and k (element to search)
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        boolean found = false;
        
        // Read array elements and check if k exists
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == k) {
                found = true;
            }
        }
        
        // Print result
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}