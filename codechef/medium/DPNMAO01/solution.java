import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        if (length <= 0) {
            int num = sc.nextInt();
            int diff = sc.nextInt();
            System.out.println(-1);
            sc.close();
            return;
        }

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();
        int diff = sc.nextInt();

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(arr[i] - num) <= diff) {
                count++;
            }
        }

        if (count == 0) System.out.println(-1);
        else System.out.println(count);

        sc.close();
    }
}