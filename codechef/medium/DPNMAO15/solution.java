import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged_arr = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged_arr[k++] = arr1[i++];
            } else {
                merged_arr[k++] = arr2[j++];
            }
        }

        while (i < n) {
            merged_arr[k++] = arr1[i++];
        }
        while (j < m) {
            merged_arr[k++] = arr2[j++];
        }

        for (int l = 0; l < n + m; l++) {
            System.out.print(merged_arr[l]);
            if (l != n + m - 1) System.out.print(" ");
        }
        System.out.println();
    }
}