import java.util.Scanner;
import java.util.Arrays;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            
            int[] ans = new int[n];
            int left = 0;
            int right = n - 1;
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    ans[i] = a[left++];
                } else {
                    ans[i] = a[right--];
                }
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        
        sc.close();
    }
}
